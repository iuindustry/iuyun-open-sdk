package com.iuyun.open.model.request.collection;

import com.iuyun.open.model.request.BaseRequest;

public class CollectClientData extends BaseRequest {

    /**
     * 数据业务类型
     */
    private String bieDataCode;

    /**
     * JSON数据
     */
    private String dataJson;

    /**
     * 客户系统在IU系统中生成的Key:
     * 车辆管理：clientData1Cars
     * 地磅管理：clientData2Device
     * 物料管理：clientData3Material
     * 物料分类：clientData4MaterialGroup
     * 磅房管理：clientData5Mineral
     * 组织管理：clientData6Organization
     * 运输管理：clientData7Transport
     */
    private String systemKey;

    public CollectClientData() {
    }

    public CollectClientData(String bieDataCode, String dataJson, String systemKey) {
        this.bieDataCode = bieDataCode;
        this.dataJson = dataJson;
        this.systemKey = systemKey;
    }

    public String getBieDataCode() {
        return bieDataCode;
    }

    public void setBieDataCode(String bieDataCode) {
        this.bieDataCode = bieDataCode;
    }

    public String getDataJson() {
        return dataJson;
    }

    public void setDataJson(String dataJson) {
        this.dataJson = dataJson;
    }

    public String getSystemKey() {
        return systemKey;
    }

    public void setSystemKey(String systemKey) {
        this.systemKey = systemKey;
    }
}
