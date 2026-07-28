package com.iuyun.open.domain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.iuyun.open.config.Config;
import com.iuyun.open.exception.BusinessException;
import com.iuyun.open.model.request.BaseRequest;
import com.iuyun.open.model.response.BaseResponse;
import com.iuyun.open.model.response.ResponseEntity;
import okhttp3.*;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

class OpenapiUtil {

    private final Config config;

    private final OkHttpClient httpClient;

    private volatile String token;

    private volatile Long expiresIn = 0L;

    public OpenapiUtil(Config config) {
        this(config, new OkHttpClient());
    }

    OpenapiUtil(Config config, OkHttpClient httpClient) {
        this.config = Objects.requireNonNull(config, "config");
        this.httpClient = Objects.requireNonNull(httpClient, "httpClient");
    }

    public <T> T doRPCRequest(String url, BaseRequest request, TypeReference<ResponseEntity<T>> responseType) {
        if (StringUtils.isBlank(request.getRequestId())) {
            request.setRequestId(UUID.randomUUID().toString().replace("-", ""));
        }

        MediaType jsonMediaType = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(jsonMediaType, JSON.toJSONString(request));
        Request.Builder builder = new Request.Builder()
                .url("http://" + this.config.getEndpoint() + url)
                .addHeader("X-Request-Id", request.getRequestId())
                .addHeader("X-Access-Auth-Token", getToken())
                .post(body);
        Request req = builder.build();
        //同步请求
        Call call = httpClient.newCall(req);
        try (Response resp = call.execute()) {
            if (resp.code() != 200) {
                throw new BusinessException("error code:" + resp.code() + " message:" + resp.message() + ", e:" + responseBodyToString(resp));
            }
            ResponseEntity<T> result = JSON.parseObject(responseBodyToString(resp), responseType);
            if (result == null) {
                throw new BusinessException("error empty response");
            }
            if (!result.isSuccess()) {
                throwBusinessException(result.getCode(), result.getException());
            }
            return result.getData();
        } catch (IOException e) {
            throw new BusinessException("error  e:" + e);
        }
    }

    private synchronized String getToken() {
        if (System.currentTimeMillis() < expiresIn) {
            return token;
        }
        String tokenUrl = "http://" + config.getEndpoint() + "/auth/token";
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
        Call call = httpClient.newCall(req);
        try (Response resp = call.execute()) {
            if (resp.code() != 200) {
                throw new BusinessException("error code:" + resp.code() + " message:" + resp.message() + ", e:" + responseBodyToString(resp));
            }
            JSONObject result = JSONObject.parseObject(responseBodyToString(resp));
            JSONObject data = result == null ? null : result.getJSONObject("data");
            if (data == null) {
                throw new BusinessException("error empty token response");
            }
            String accessToken = data.getString("accessToken");
            Long tokenExpiresIn = data.getLong("expiresIn");
            if (StringUtils.isBlank(accessToken) || tokenExpiresIn == null) {
                throw new BusinessException("error invalid token response");
            }
            token = accessToken;
            expiresIn = (tokenExpiresIn - 300) * 1000 + System.currentTimeMillis();
            return token;
        } catch (IOException e) {
            throw new BusinessException("error  e:" + e);
        }
    }

    void close() {
        httpClient.dispatcher().executorService().shutdown();
        httpClient.connectionPool().evictAll();
        Cache cache = httpClient.cache();
        if (cache != null) {
            try {
                cache.close();
            } catch (IOException e) {
                throw new BusinessException("close http client cache failed e:" + e);
            }
        }
    }

    private static String responseBodyToString(Response response) throws IOException {
        ResponseBody responseBody = response.body();
        return responseBody == null ? "" : responseBody.string();
    }

    private static void throwBusinessException(Integer code, String message) {
        if (code == null) {
            throw new BusinessException(message);
        }
        throw new BusinessException(code, message);
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
