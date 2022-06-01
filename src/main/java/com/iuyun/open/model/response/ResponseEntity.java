package com.iuyun.open.model.response;

import java.io.Serializable;

public class ResponseEntity<T> implements Serializable {
    /**
     * "接口访问时间
     */
    private Long timestamp;
    /**
     * "接口状态编码，0为正常
     */
    private Integer code;
    /**
     * "接口异常信息
     */
    private String exception;
    /**
     * "接口数据对象
     */
    private T data;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess(){
        return code == 0;
    }
}
