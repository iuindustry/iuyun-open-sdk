package com.iuyun.open.model.request.metadata;

import com.iuyun.open.model.request.PageQueryRequest;

import java.util.List;

public class MetadataQueryRequest extends PageQueryRequest {
    /**
     * 数据编码（支持多个）
     */
    private List<String> dataCodes;
    /**
     * 部门Id
     */
    private List<Long> departmentId;
    /**
     * 分组id
     */
    private List<Long> groupId;
    /**
     * 设备id
     */
    private List<Long> deviceId;
    /**
     * 数据类型
     */
    private String dataType;
    /**
     * 父级数据类型
     */
    private String parentDataType;
    /**
     * 分组名称
     */
    private String groupName;

    public List<String> getDataCodes() {
        return dataCodes;
    }

    public void setDataCodes(List<String> dataCodes) {
        this.dataCodes = dataCodes;
    }

    public List<Long> getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(List<Long> departmentId) {
        this.departmentId = departmentId;
    }

    public List<Long> getGroupId() {
        return groupId;
    }

    public void setGroupId(List<Long> groupId) {
        this.groupId = groupId;
    }

    public List<Long> getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(List<Long> deviceId) {
        this.deviceId = deviceId;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getParentDataType() {
        return parentDataType;
    }

    public void setParentDataType(String parentDataType) {
        this.parentDataType = parentDataType;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
