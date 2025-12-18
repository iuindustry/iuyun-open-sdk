package com.iuyun.open.model.response;


public class CollectDataRes extends BaseResponse {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 数据Id
     */
    private String dataCode;

    /**
     * 数据值
     */
    private String dataValue;

    /**
     * 数据采集时间
     */
    private String dataTime;

    /**
     * 机器狗ID
     */
    private Long dogDeviceId;

    /**
     * 机器狗部件ID
     */
    private Long dogComponentId;

    public CollectDataRes() {
    }

    public CollectDataRes(Long id, String dataCode, String dataValue, String dataTime, Long dogDeviceId, Long dogComponentId) {
        this.id = id;
        this.dataCode = dataCode;
        this.dataValue = dataValue;
        this.dataTime = dataTime;
        this.dogDeviceId = dogDeviceId;
        this.dogComponentId = dogComponentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataCode() {
        return dataCode;
    }

    public void setDataCode(String dataCode) {
        this.dataCode = dataCode;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public Long getDogDeviceId() {
        return dogDeviceId;
    }

    public void setDogDeviceId(Long dogDeviceId) {
        this.dogDeviceId = dogDeviceId;
    }

    public Long getDogComponentId() {
        return dogComponentId;
    }

    public void setDogComponentId(Long dogComponentId) {
        this.dogComponentId = dogComponentId;
    }
}
