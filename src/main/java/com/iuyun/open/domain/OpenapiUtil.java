package com.iuyun.open.domain;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.TypeReference;
import com.iuyun.open.config.Config;
import com.iuyun.open.exception.BusinessException;
import com.iuyun.open.model.request.BaseRequest;
import com.iuyun.open.model.response.BaseResponse;
import com.iuyun.open.model.response.ResponseEntity;
import okhttp3.*;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.UUID;

class OpenapiUtil {

    private final Config config;

    private volatile static String token;

    private volatile static Long expiresIn = 0L;

    public OpenapiUtil(Config config) {
        this.config = config;
    }

    public <T extends BaseResponse> T doRPCRequest(String url, BaseRequest request, TypeReference<ResponseEntity<T>> responseType) {
        if (StringUtils.isBlank(request.getRequestId())) {
            request.setRequestId(UUID.randomUUID().toString().replace("-", ""));
        }

        OkHttpClient client = new OkHttpClient();
        MediaType jsonMediaType = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(jsonMediaType, JSON.toJSONString(request));
        Request.Builder builder = new Request.Builder()
                .url("http://" + this.config.getEndpoint() + url)
                .addHeader("X-Request-Id", request.getRequestId())
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
        if (resp.code() != 200) {
            throw new BusinessException("error code:" + resp.code() + " message:" + resp.message() + ", e:" + resp.body().toString());
        }
        ResponseEntity<T> result = null;
        try {
            result = JSON.parseObject(resp.body().string(), responseType);
            resp.close();
            if (!result.isSuccess()) {
                throw new BusinessException(result.getCode(), result.getException());
            }
        } catch (IOException e) {
            throw new BusinessException("error  e:" + e);
        }
        return result.getData();
    }

    private synchronized String getToken() {
        if (System.currentTimeMillis() < expiresIn) {
            return token;
        }
        String tokenUrl = "http://" + config.getEndpoint() + "/auth/token";
        OkHttpClient client = new OkHttpClient();
        MediaType jsonMediaType = MediaType.parse("application/json; charset=utf-8");
        TokenRequest request = new TokenRequest();
        request.setAppId(config.getAppId());
        request.setSecret(config.getSecret());

        RequestBody body = RequestBody.create(jsonMediaType, JSON.toJSONString(request));
        Request.Builder builder = new Request.Builder()
                .url(tokenUrl)
                .addHeader("requestId", request.getRequestId())
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
        JSONObject result = null;
        if (resp.code() != 200) {
            throw new BusinessException("error code:" + resp.code() + " message:" + resp.message() + ", e:" + resp.body().toString());
        }
        try {
            result = JSONObject.parseObject(resp.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
        token = result.getJSONObject("data").getString("accessToken");
        expiresIn = (result.getJSONObject("data").getLong("expiresIn") - 300) * 1000 + System.currentTimeMillis();
        resp.close();
        return token;
    }

    private class TokenRequest extends BaseRequest {
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
