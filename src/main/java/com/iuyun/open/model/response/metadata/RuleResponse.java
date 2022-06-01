package com.iuyun.open.model.response.metadata;

import com.iuyun.open.model.response.BaseResponse;

import java.util.List;


public class RuleResponse extends BaseResponse {
    /**
     * 规则ID
     */
    private Long id;
    /**
     * 数据ID
     */
    private String dataCode;
    /**
     * 企业ID
     */
    private Long orgId;
    /**
     * 企业APPID
     */
    private String appId;
    /**
     * 计算方式(0不转换,1线性,2 离散映射)
     */
    private Integer conditionType;
    /**
     * 规则名称
     */
    private String name;
    /**
     * 源起始值
     */
    private Integer sourceStart;
    /**
     * 源结束值
     */
    private Integer sourceEnd;
    /**
     * 目标起始值
     */
    private Double targetStart;
    /**
     * 目标结束值
     */
    private Double targetEnd;
    /**
     * 是否是模版
     */
    private Integer isTemplate;
    /**
     * 偏移量
     */
    private Double offsetValue;
    /**
     * 转换规则
     */
    private List<RuleThresholdResponse> ruleThresholds;
    /**
     * 统计规则
     */
    private List<RuleStatisticsResponse> ruleStatistics;

    public RuleResponse() {
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

    public Long getOrgId() {
        return this.orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Integer getConditionType() {
        return this.conditionType;
    }

    public void setConditionType(Integer conditionType) {
        this.conditionType = conditionType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSourceStart() {
        return this.sourceStart;
    }

    public void setSourceStart(Integer sourceStart) {
        this.sourceStart = sourceStart;
    }

    public Integer getSourceEnd() {
        return this.sourceEnd;
    }

    public void setSourceEnd(Integer sourceEnd) {
        this.sourceEnd = sourceEnd;
    }

    public Double getTargetStart() {
        return this.targetStart;
    }

    public void setTargetStart(Double targetStart) {
        this.targetStart = targetStart;
    }

    public Double getTargetEnd() {
        return this.targetEnd;
    }

    public void setTargetEnd(Double targetEnd) {
        this.targetEnd = targetEnd;
    }

    public Integer getIsTemplate() {
        return this.isTemplate;
    }

    public void setIsTemplate(Integer isTemplate) {
        this.isTemplate = isTemplate;
    }

    public Double getOffsetValue() {
        return this.offsetValue;
    }

    public void setOffsetValue(Double offsetValue) {
        this.offsetValue = offsetValue;
    }

    public List<RuleThresholdResponse> getRuleThresholds() {
        return this.ruleThresholds;
    }

    public void setRuleThresholds(List<RuleThresholdResponse> ruleThresholds) {
        this.ruleThresholds = ruleThresholds;
    }

    public List<RuleStatisticsResponse> getRuleStatistics() {
        return this.ruleStatistics;
    }

    public void setRuleStatistics(List<RuleStatisticsResponse> ruleStatistics) {
        this.ruleStatistics = ruleStatistics;
    }
}
