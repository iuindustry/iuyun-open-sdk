package com.iuyun.open.util;

import com.iuyun.open.model.request.BaseRequest;
import com.iuyun.open.model.response.BaseResponse;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class OpenapiUtil {


    public static <T extends BaseResponse> T doRPCRequest(String url, String method, BaseRequest request, T response) {
        OkHttpClient client = new OkHttpClient();
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create("jsonStr",JSON);
        Request.Builder builder = new Request.Builder()
                .url(url)
                .addHeader("requestId",request.getRequestId())
                .post(body);

        return null;
    }
}
