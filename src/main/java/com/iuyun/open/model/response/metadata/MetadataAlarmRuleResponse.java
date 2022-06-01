package com.iuyun.open.model.response.metadata;

import com.iuyun.open.model.response.BaseResponse;

import java.util.List;

public class MetadataAlarmRuleResponse extends BaseResponse {
    /**
     * id
     */
    private Long id;
    /**
     * 企业ID
     */
    private Long orgId;
    /**
     * 数据唯一编码
     */
    private String dataCode;
    /**
     * 名称
     */
    private String name;
    /**
     * 预警规则类型（0 设备离线； 1 其他）
     */
    private Integer ruleType;
    /**
     * 状态: 1-启用;2-禁用
     */
    private Integer status;
    /**
     * 预警负责人
     */
    private Long devicePrincipalId;
    /**
     * 预警接收提醒人
     */
    private String deviceReminderId;
    /**
     * 通知方式: 1微信；2短信；3站内信；4API;可多选,分隔
     */
    private String noticeTypes;
    /**
     * 预警触发规则json
     */
    private String triggerRule;
    /**
     * 预警状态: 1-需人工确认; 2-不需要人工确认
     */
    private Integer alarmStatus;
    /**
     * 工单状态: 1-需生成工单; 2-不生成工单
     */
    private Integer worksheetStatus;
    /**
     * 数据告警规则条件集合
     */
    private List<MetadataAlarmThresholdResponse> thresholdList;

    public MetadataAlarmRuleResponse() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrgId() {
        return this.orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getDataCode() {
        return this.dataCode;
    }

    public void setDataCode(String dataCode) {
        this.dataCode = dataCode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRuleType() {
        return this.ruleType;
    }

    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getDevicePrincipalId() {
        return this.devicePrincipalId;
    }

    public void setDevicePrincipalId(Long devicePrincipalId) {
        this.devicePrincipalId = devicePrincipalId;
    }

    public String getDeviceReminderId() {
        return this.deviceReminderId;
    }

    public void setDeviceReminderId(String deviceReminderId) {
        this.deviceReminderId = deviceReminderId;
    }

    public String getNoticeTypes() {
        return this.noticeTypes;
    }

    public void setNoticeTypes(String noticeTypes) {
        this.noticeTypes = noticeTypes;
    }

    public String getTriggerRule() {
        return this.triggerRule;
    }

    public void setTriggerRule(String triggerRule) {
        this.triggerRule = triggerRule;
    }

    public Integer getAlarmStatus() {
        return this.alarmStatus;
    }

    public void setAlarmStatus(Integer alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public Integer getWorksheetStatus() {
        return this.worksheetStatus;
    }

    public void setWorksheetStatus(Integer worksheetStatus) {
        this.worksheetStatus = worksheetStatus;
    }

    public List<MetadataAlarmThresholdResponse> getThresholdList() {
        return this.thresholdList;
    }

    public void setThresholdList(List<MetadataAlarmThresholdResponse> thresholdList) {
        this.thresholdList = thresholdList;
    }

}

