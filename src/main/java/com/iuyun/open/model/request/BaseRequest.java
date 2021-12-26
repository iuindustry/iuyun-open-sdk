package com.iuyun.open.model.request;

import java.util.UUID;

public class BaseRequest {

    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public BaseRequest() {
        this.requestId = UUID.randomUUID().toString().replace("-", "");
    }
}
