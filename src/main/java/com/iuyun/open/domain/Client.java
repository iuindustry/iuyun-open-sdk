package com.iuyun.open.domain;

import com.alibaba.fastjson2.TypeReference;
import com.iuyun.open.config.Config;
import com.iuyun.open.model.request.BaseRequest;
import com.iuyun.open.model.request.collection.BatchCollectDataRequest;
import com.iuyun.open.model.request.collection.CollectClientData;
import com.iuyun.open.model.request.collection.CollectDataRequest;
import com.iuyun.open.model.request.collection.CollectImgDataRequest;
import com.iuyun.open.model.request.command.ControlCommandExecuteCallbackRequest;
import com.iuyun.open.model.request.metadata.MetadataQueryRequest;
import com.iuyun.open.model.response.*;
import com.iuyun.open.model.response.metadata.MetadataResponse;

public class Client {

    private final OpenapiUtil openapiUtil;

    public Client(Config config) {
        this.openapiUtil = new OpenapiUtil(config);
    }

    /**
     * 数据采集
     *
     * @param request 数据采集入参
     */
    public void collectData(CollectDataRequest request) {
        openapiUtil.doRPCRequest("/collect/collectData", request, new TypeReference<ResponseEntity<BaseResponse>>() {
        });
    }

    /**
     * 批量数据采集
     *
     * @param request 数据采集入参
     */
    public void batchCollectData(BatchCollectDataRequest request) {
        openapiUtil.doRPCRequest("/collect/v2/collectDatas", request, new TypeReference<ResponseEntity<BaseResponse>>() {
        });
    }

    /**
     * 批量数据采集
     *
     * @param request 数据采集入参
     */
    public PageResponse<MetadataResponse> queryMetadata(MetadataQueryRequest request) {
        TypeReference<ResponseEntity<PageResponse<MetadataResponse>>> type = new TypeReference<ResponseEntity<PageResponse<MetadataResponse>>>() {
        };
        return openapiUtil.doRPCRequest("/metadata/query", request, type);
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
        return openapiUtil.doRPCRequest("/obs/getSecurityToken", new BaseRequest(), type);
    }

    /**
     * 采集图片类型数据
     *
     * @param request 数据采集入参
     * @return 临时OBS的AK/SK/SecurityToken
     */
    public CreateSecurityTokenResponse collectImgData(CollectImgDataRequest request) {
        TypeReference<ResponseEntity<CreateSecurityTokenResponse>> type =
                new TypeReference<ResponseEntity<CreateSecurityTokenResponse>>() {
                };
        return openapiUtil.doRPCRequest("/collect/collectImgData", request, type);
    }

    public void collectClientData(CollectClientData request) {
        openapiUtil.doRPCRequest("/clientData/collectData", request, new TypeReference<ResponseEntity<BaseResponse>>() {
        });
    }

    public Boolean checkExecuteCode(String executeCode) {
        ValidateControlRecordResponse validateControlRecordResponse = openapiUtil.doRPCRequest("/command/execute/check/" + executeCode, new BaseRequest(), new TypeReference<ResponseEntity<ValidateControlRecordResponse>>() {
        });
        return validateControlRecordResponse.getSuccess();
    }

    /**
     * 下控回调
     *
     * @param request 回调入参
     */
    public void executeCallback(ControlCommandExecuteCallbackRequest request) {
        openapiUtil.doRPCRequest("/command/execute/callback", request, new TypeReference<ResponseEntity<BaseResponse>>() {
        });

    }

}
