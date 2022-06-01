package com.iuyun.open.model.response.metadata;

import com.iuyun.open.model.response.BaseResponse;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class RuleStatisticsResponse extends BaseResponse {
    /**
     * 统计规则ID
     */
    private Long id;
    /**
     * 规则ID
     */
    private Long ruleId;
    /**
     * 类型 0:不转换 1:值变换 2:聚合
     */
    private Integer type;
    /**
     * 条件  1:改变记录 2:状态时长 3:状态次数 11:求和 12:最大 13:最小 14:计数 15:平均
     */
    private Integer conditionValue;
    /**
     * 周期类型 1:小时 2:日 3:月 4:年 5:时间区间
     */
    private Integer cycleType;
    /**
     * 区间名
     */
    private String intervalName;
    /**
     * 启用状态 1启用0禁用
     */
    private Integer useState;
    /**
     * 子数据id
     */
    private String childDataCode;
    /**
     * 是否被动  1是0否
     */
    private Integer isPassivity;
    /**
     * 系数值
     */
    private BigDecimal expression;
    /**
     * 数据推送类型：0第三方，1数据分析，2能耗
     */
    private String routeType;
    /**
     * 推送第三方url
     */
    private String routeUrl;
    /**
     * 时间区间集合
     */
    private List<DataRange> dataRanges;

    public RuleStatisticsResponse() {
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

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getConditionValue() {
        return this.conditionValue;
    }

    public void setConditionValue(Integer conditionValue) {
        this.conditionValue = conditionValue;
    }

    public Integer getCycleType() {
        return this.cycleType;
    }

    public void setCycleType(Integer cycleType) {
        this.cycleType = cycleType;
    }

    public String getIntervalName() {
        return this.intervalName;
    }

    public void setIntervalName(String intervalName) {
        this.intervalName = intervalName;
    }

    public Integer getUseState() {
        return this.useState;
    }

    public void setUseState(Integer useState) {
        this.useState = useState;
    }

    public String getChildDataCode() {
        return this.childDataCode;
    }

    public void setChildDataCode(String childDataCode) {
        this.childDataCode = childDataCode;
    }

    public Integer getIsPassivity() {
        return this.isPassivity;
    }

    public void setIsPassivity(Integer isPassivity) {
        this.isPassivity = isPassivity;
    }

    public BigDecimal getExpression() {
        return this.expression;
    }

    public void setExpression(BigDecimal expression) {
        this.expression = expression;
    }

    public String getRouteType() {
        return this.routeType;
    }

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    public String getRouteUrl() {
        return this.routeUrl;
    }

    public void setRouteUrl(String routeUrl) {
        this.routeUrl = routeUrl;
    }

    public List<RuleStatisticsResponse.DataRange> getDataRanges() {
        return this.dataRanges;
    }

    public void setDataRanges(List<RuleStatisticsResponse.DataRange> dataRanges) {
        this.dataRanges = dataRanges;
    }


    public static class DataRange {
        /**
         * id
         */
        private Long id;
        /**
         * 统计规则id
         */
        private Long ruleStatisticsId;
        /**
         * 区间类型开始时间 0-23小时
         */
        private Date startTime;
        /**
         * 区间类型结束时间 0-23小时
         */
        private Date endTime;

        public DataRange() {
        }

        public Long getId() {
            return this.id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getRuleStatisticsId() {
            return this.ruleStatisticsId;
        }

        public void setRuleStatisticsId(Long ruleStatisticsId) {
            this.ruleStatisticsId = ruleStatisticsId;
        }

        public Date getStartTime() {
            return this.startTime;
        }

        public void setStartTime(Date startTime) {
            this.startTime = startTime;
        }

        public Date getEndTime() {
            return this.endTime;
        }

        public void setEndTime(Date endTime) {
            this.endTime = endTime;
        }
    }
}