package com.iuyun.open.model.request.command;

import com.iuyun.open.model.request.BaseRequest;

import java.util.Date;

public class ControlCommandExecuteCallbackRequest extends BaseRequest {
    /**
     * 指令记录ID
     */
    private Long id;
    /**
     * 是否执行成功
     */
    private Boolean executeSuccess;
    /**
     * 执行时间
     */
    private Date executeTime;
    /**
     * 执行描述
     */
    private String executeDescription;

    public ControlCommandExecuteCallbackRequest() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getExecuteSuccess() {
        return executeSuccess;
    }

    public void setExecuteSuccess(Boolean executeSuccess) {
        this.executeSuccess = executeSuccess;
    }

    public Date getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Date executeTime) {
        this.executeTime = executeTime;
    }

    public String getExecuteDescription() {
        return executeDescription;
    }

    public void setExecuteDescription(String executeDescription) {
        this.executeDescription = executeDescription;
    }
}
