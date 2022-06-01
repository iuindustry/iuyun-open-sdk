package com.iuyun.open.model.request.collection;

import com.iuyun.open.model.request.BaseRequest;

import java.util.List;

public class BatchCollectDataRequest extends BaseRequest {

    public BatchCollectDataRequest(List<CollectData> data){
        this.data = data;
    }

    public BatchCollectDataRequest(){

    }

    /**
     * 批量上传数据源
     */
    private List<CollectData> data;

    public List<CollectData> getData() {
        return data;
    }

    public void setData(List<CollectData> data) {
        this.data = data;
    }
}

