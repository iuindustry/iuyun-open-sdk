package com.iuyun.open.model.request.collection;

import com.iuyun.open.model.request.PageQueryRequest;

import java.util.List;

public class CollectDataQueryRequest extends PageQueryRequest {

    /**
     * 数据ID列表
     */
    private List<String> dataCodeList;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    public CollectDataQueryRequest() {

    }

    public CollectDataQueryRequest(List<String> dataCodeList, String startTime, String endTime) {
        this.dataCodeList = dataCodeList;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public List<String> getDataCodeList() {
        return dataCodeList;
    }

    public void setDataCodeList(List<String> dataCodeList) {
        this.dataCodeList = dataCodeList;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
