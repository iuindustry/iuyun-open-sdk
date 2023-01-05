package com.iuyun.open.model.request.collection;

import com.iuyun.open.model.request.BaseRequest;

public class CollectImgDataRequest extends BaseRequest {
    /**
     * 数据编码
     */
    private String dataCode;

    /**
     * 数据采集时间格式</br>
     * 源数据：2021-12-26 20:48:10
     */
    private String dataTime;

    /**
     * 统计结果
     */
    private String statisticsValue;

    /**
     * 图片上传状态 0失败 1成功
     */
    private Integer uploadingState;

    public CollectImgDataRequest() {
    }

    public CollectImgDataRequest(String dataCode, String dataTime, String statisticsValue, Integer uploadingState) {
        this.dataCode = dataCode;
        this.dataTime = dataTime;
        this.statisticsValue = statisticsValue;
        this.uploadingState = uploadingState;
    }

    public String getDataCode() {
        return dataCode;
    }

    public void setDataCode(String dataCode) {
        this.dataCode = dataCode;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public String getStatisticsValue() {
        return statisticsValue;
    }

    public void setStatisticsValue(String statisticsValue) {
        this.statisticsValue = statisticsValue;
    }

    public Integer getUploadingState() {
        return uploadingState;
    }

    public void setUploadingState(Integer uploadingState) {
        this.uploadingState = uploadingState;
    }
}
