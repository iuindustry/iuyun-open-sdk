package com.iuyun.open.domain;

import com.iuyun.open.config.Config;
import okhttp3.OkHttpClient;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class OpenapiUtilTest {

    @Test
    public void defaultHttpClientUsesTenMinuteRequestAndReadTimeouts() throws Exception {
        OpenapiUtil openapiUtil = new OpenapiUtil(Config.build("appId", "secret", "endpoint"));
        Field httpClientField = OpenapiUtil.class.getDeclaredField("httpClient");
        httpClientField.setAccessible(true);
        OkHttpClient httpClient = (OkHttpClient) httpClientField.get(openapiUtil);

        assertEquals(TimeUnit.MINUTES.toMillis(10), httpClient.callTimeoutMillis());
        assertEquals(TimeUnit.MINUTES.toMillis(10), httpClient.readTimeoutMillis());
        assertEquals(TimeUnit.SECONDS.toMillis(10), httpClient.connectTimeoutMillis());
    }
}
