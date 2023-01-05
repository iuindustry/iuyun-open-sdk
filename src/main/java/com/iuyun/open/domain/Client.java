package com.iuyun.open.domain;

import com.alibaba.fastjson2.TypeReference;
import com.iuyun.open.config.Config;
import com.iuyun.open.model.request.BaseRequest;
import com.iuyun.open.model.request.collection.BatchCollectDataRequest;
import com.iuyun.open.model.request.collection.CollectDataRequest;
import com.iuyun.open.model.request.collection.CollectImgDataRequest;
import com.iuyun.open.model.request.metadata.MetadataQueryRequest;
import com.iuyun.open.model.response.BaseResponse;
import com.iuyun.open.model.response.CreateSecurityTokenResponse;
import com.iuyun.open.model.response.PageResponse;
import com.iuyun.open.model.response.ResponseEntity;
import com.iuyun.open.model.response.metadata.MetadataResponse;

public class Client {

    public Client(Config config) {

        OpenapiUtil.setConfig(config);
    }

    /**
     * 数据采集
     *
     * @param request 数据采集入参
     */
    public void collectData(CollectDataRequest request) {
        OpenapiUtil.doRPCRequest("/collect/collectData", request, new TypeReference<ResponseEntity<BaseResponse>>() {});
    }

    /**
     * 批量数据采集
     *
     * @param request 数据采集入参
     */
    public void batchCollectData(BatchCollectDataRequest request) {
        OpenapiUtil.doRPCRequest("/collect/v2/collectDatas", request, new TypeReference<ResponseEntity<BaseResponse>>() {});
    }

    /**
     * 批量数据采集
     *
     * @param request 数据采集入参
     */
    public PageResponse<MetadataResponse> queryMetadata(MetadataQueryRequest request) {
        TypeReference<ResponseEntity<PageResponse<MetadataResponse>>> type = new TypeReference<ResponseEntity<PageResponse<MetadataResponse>>>(){};
        return OpenapiUtil.doRPCRequest("/metadata/query", request, type);
    }

    /**
     * 获取临时OBS的AK/SK/SecurityToken
     *
     * @return 临时OBS的AK/SK/SecurityToken
     */
    public CreateSecurityTokenResponse queryObsToken() {
        TypeReference<ResponseEntity<CreateSecurityTokenResponse>> type =
                new TypeReference<ResponseEntity<CreateSecurityTokenResponse>>() {
                };
        return OpenapiUtil.doRPCRequest("/obs/getSecurityToken", new BaseRequest(), type);
    }

    /**
     * 采集图片类型数据
     * @param request 数据采集入参
     * @return 临时OBS的AK/SK/SecurityToken
     */
    public CreateSecurityTokenResponse collectImgData(CollectImgDataRequest request) {
        TypeReference<ResponseEntity<CreateSecurityTokenResponse>> type =
                new TypeReference<ResponseEntity<CreateSecurityTokenResponse>>() {
                };
        return OpenapiUtil.doRPCRequest("/collect/collectImgData", request, type);
    }

}
