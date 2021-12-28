package com.iuyun.open.domain;

import com.iuyun.open.config.Config;
import com.iuyun.open.model.request.collection.CollectDataRequest;
import com.iuyun.open.model.response.BaseResponse;

public class Client {

    public Client(Config config) {

        OpenapiUtil.setConfig(config);
    }

    /**
     * 数据采集
     *
     * @param request
     */
    public void collectData(CollectDataRequest request) {
        OpenapiUtil.doRPCRequest("/collect/collectData", request, BaseResponse.class);
    }


}
