package com.iuyun.open.model.response.metadata;

import com.iuyun.open.model.response.BaseResponse;

import java.math.BigDecimal;

public class MetadataAlarmThresholdResponse extends BaseResponse {
    /**
     * 主键
     */
    private Long id;
    /**
     * 数据告警规则ID
     */
    private Long metadataAlarmRuleId;
    /**
     * 运算方式(=,!=,>,>=,<,<=,[),[],(],(),else)
     */
    private String conditionType;
    /**
     * 阈值起始值
     */
    private BigDecimal thresholdValueStart;
    /**
     * 阈值结束值
     */
    private BigDecimal thresholdValueEnd;
    /**
     * 预警级别
     */
    private Integer alarmLevel;
    /**
     * 预警级别名称
     */
    private String alarmLevelName;

    public MetadataAlarmThresholdResponse() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMetadataAlarmRuleId() {
        return this.metadataAlarmRuleId;
    }

    public void setMetadataAlarmRuleId(Long metadataAlarmRuleId) {
        this.metadataAlarmRuleId = metadataAlarmRuleId;
    }

    public String getConditionType() {
        return this.conditionType;
    }

    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }

    public BigDecimal getThresholdValueStart() {
        return this.thresholdValueStart;
    }

    public void setThresholdValueStart(BigDecimal thresholdValueStart) {
        this.thresholdValueStart = thresholdValueStart;
    }

    public BigDecimal getThresholdValueEnd() {
        return this.thresholdValueEnd;
    }

    public void setThresholdValueEnd(BigDecimal thresholdValueEnd) {
        this.thresholdValueEnd = thresholdValueEnd;
    }

    public Integer getAlarmLevel() {
        return this.alarmLevel;
    }

    public void setAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public String getAlarmLevelName() {
        return this.alarmLevelName;
    }

    public void setAlarmLevelName(String alarmLevelName) {
        this.alarmLevelName = alarmLevelName;
    }
}
