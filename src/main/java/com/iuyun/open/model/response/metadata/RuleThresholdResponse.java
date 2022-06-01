package com.iuyun.open.model.response.metadata;

import com.iuyun.open.model.response.BaseResponse;

import java.math.BigDecimal;

public class RuleThresholdResponse extends BaseResponse {
    /**
     * 转换规则ID
     */
    private Long id;
    /**
     * 规则ID
     */
    private Long ruleId;
    /**
     * 运算方式(=,!=,>,>=,<.<=,[),[],(],(),else,/,*)
     */
    private String conditionType;
    /**
     * 阈值起始值
     */
    private Integer thresholdValueStart;
    /**
     * 阈值结束值
     */
    private Integer thresholdValueEnd;
    /**
     * 转换值
     */
    private BigDecimal targetValue;
    /**
     * 转换值名称
     */
    private String targetValueName;

    public RuleThresholdResponse() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRuleId() {
        return this.ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public String getConditionType() {
        return this.conditionType;
    }

    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }

    public Integer getThresholdValueStart() {
        return this.thresholdValueStart;
    }

    public void setThresholdValueStart(Integer thresholdValueStart) {
        this.thresholdValueStart = thresholdValueStart;
    }

    public Integer getThresholdValueEnd() {
        return this.thresholdValueEnd;
    }

    public void setThresholdValueEnd(Integer thresholdValueEnd) {
        this.thresholdValueEnd = thresholdValueEnd;
    }

    public BigDecimal getTargetValue() {
        return this.targetValue;
    }

    public void setTargetValue(BigDecimal targetValue) {
        this.targetValue = targetValue;
    }

    public String getTargetValueName() {
        return this.targetValueName;
    }

    public void setTargetValueName(String targetValueName) {
        this.targetValueName = targetValueName;
    }
}

