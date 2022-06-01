package com.iuyun.open.model.response.metadata;

import java.util.Date;
import java.util.List;

public class MetadataResponse {
    /**
     * id
     */
    private Long id;
    /**
     * 数据编码
     */
    private String dataCode;
    /**
     * 数据类型
     */
    private String dataType;
    /**
     * 数据名称
     */
    private String dataName;
    /**
     * 设备ID
     */
    private Long deviceId;
    /**
     * 设备名称
     */
    private String deviceName;
    /**
     * 部门ID
     */
    private Long departmentId;
    /**
     * 部门名称
     */
    private String departmentName;
    /**
     * 企业ID
     */
    private Long orgId;
    /**
     * 数据单位
     */
    private String unitName;
    /**
     * 分组ID
     */
    private Long groupId;
    /**
     * 分组名称
     */
    private String groupName;
    /**
     * 描述
     */
    private String description;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 上报频率
     */
    private Long uploadingFrequency;
    /**
     * 是否是数据加工 null否;1是;0否
     */
    private Integer flowType;
    /**
     * 父级编号
     */
    private String parentDataType;
    /**
     * 规则信息
     */
    private RuleResponse rule;
    /**
     * 预警规则
     */
    private List<MetadataAlarmRuleResponse> metadataAlarmRulelist;
    /**
     * 分组id集合
     */
    private List<Long> greoupIds;

    public MetadataResponse() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataCode() {
        return this.dataCode;
    }

    public void setDataCode(String dataCode) {
        this.dataCode = dataCode;
    }

    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataName() {
        return this.dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public Long getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Long getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Long getOrgId() {
        return this.orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getUnitName() {
        return this.unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUploadingFrequency() {
        return this.uploadingFrequency;
    }

    public void setUploadingFrequency(Long uploadingFrequency) {
        this.uploadingFrequency = uploadingFrequency;
    }

    public Integer getFlowType() {
        return this.flowType;
    }

    public void setFlowType(Integer flowType) {
        this.flowType = flowType;
    }

    public String getParentDataType() {
        return this.parentDataType;
    }

    public void setParentDataType(String parentDataType) {
        this.parentDataType = parentDataType;
    }

    public RuleResponse getRule() {
        return this.rule;
    }

    public void setRule(RuleResponse rule) {
        this.rule = rule;
    }

    public List<MetadataAlarmRuleResponse> getMetadataAlarmRulelist() {
        return this.metadataAlarmRulelist;
    }

    public void setMetadataAlarmRulelist(List<MetadataAlarmRuleResponse> metadataAlarmRulelist) {
        this.metadataAlarmRulelist = metadataAlarmRulelist;
    }

    public List<Long> getGreoupIds() {
        return this.greoupIds;
    }

    public void setGreoupIds(List<Long> greoupIds) {
        this.greoupIds = greoupIds;
    }
}
