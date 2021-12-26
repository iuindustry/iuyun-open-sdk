package com.iuyun.open.domain;

import com.alibaba.fastjson.JSONObject;
import com.iuyun.open.config.Config;
import com.iuyun.open.exception.BusinessException;
import com.iuyun.open.model.request.BaseRequest;
import com.iuyun.open.model.response.BaseResponse;
import okhttp3.*;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.UUID;

class OpenapiUtil {

    private static Config config;

    private volatile static String token;

    private volatile static Long expiresIn = 0L;

    public static <T extends BaseResponse> T doRPCRequest(String url, BaseRequest request, Class<T> response) {
        if (StringUtils.isBlank(request.getRequestId())) {
            request.setRequestId(UUID.randomUUID().toString().replace("-", ""));
        }
        OkHttpClient client = new OkHttpClient();
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(JSONObject.toJSONString(request), JSON);
        Request.Builder builder = new Request.Builder()
                .url("http://" + config.getEndpoint() + url)
                .addHeader("requestId", request.getRequestId())
                .addHeader("X-Access-Auth-Token", getToken())
                .post(body);
        Request req = builder.build();
        //同步请求
        Call call = client.newCall(req);
        Response resp = null;
        try {
            resp = call.execute();
        } catch (IOException e) {
            throw new BusinessException("error  e:" + e);
        }
        T result = null;
        try {
            result = JSONObject.parseObject(resp.body().string(), response);
            resp.close();
        } catch (IOException e) {
            throw new BusinessException("error  e:" + e);
        }
        return result;
    }

    public static void setConfig(Config config) {
        OpenapiUtil.config = config;
    }


    private static String getToken() {
        if (System.currentTimeMillis() < expiresIn) {
            return token;
        }
        String tokenUrl = "http://" + config.getEndpoint() + "/auth/token";
        OkHttpClient client = new OkHttpClient();
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        TokenRequest request = new TokenRequest();
        request.setAppId(config.getAppId());
        request.setSecret(config.getSecret());

        RequestBody body = RequestBody.create(JSONObject.toJSONString(request), JSON);
        Request.Builder builder = new Request.Builder()
                .url("http://" + config.getEndpoint() + tokenUrl)
                .addHeader("requestId", request.getRequestId())
                .post(body);
        Request req = builder.build();
        //同步请求
        Call call = client.newCall(req);
        try {
            Response resp = call.execute();
            token = JSONObject.parseObject(resp.body().string()).getJSONObject("data").getString("accessToken");
            expiresIn = JSONObject.parseObject(resp.body().string()).getJSONObject("data").getLong("expiresIn");
            resp.close();
        } catch (IOException e) {
            throw new BusinessException("error  e:" + e);
        }
        return token;
    }

    private static class TokenRequest extends BaseRequest {
        private String appId;

        private String secret;

        public String getAppId() {
            return appId;
        }

        public void setAppId(String appId) {
            this.appId = appId;
        }

        public String getSecret() {
            return secret;
        }

        public void setSecret(String secret) {
            this.secret = secret;
        }
    }

}
