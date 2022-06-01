package com.iuyun.open.model.request.collection;

import java.math.BigDecimal;

public class CollectDataImpl implements CollectData {
    /**
     * 数据编码
     */
    private String dataCode;
    /**
     * 数据采集时间格式</br>
     * 源数据：2021-12-26 20:48:10
     * 年数据：2021
     * 月数据：2021-12
     * 日数据：2021-12-26
     * 小时数据： 2021-12-26 20
     * 时间区间：传递开始时间所在的日期 2021-12-26
     */
    private String dataTime;

    /**
     * 数据值(离线类型有此值,对应值变换枚举)
     * 源数据不需要传递
     */
    private BigDecimal dataValue;
    /**
     * 规则id(源数据时该值不需要传递)
     */
    private Long ruleStatisticsId;
    /**
     * 统计结果
     */
    private String statisticsValue;

    @Override
    public String getDataCode() {
        return dataCode;
    }

    @Override
    public void setDataCode(String dataCode) {
        this.dataCode = dataCode;
    }

    @Override
    public String getDataTime() {
        return dataTime;
    }

    @Override
    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    @Override
    public BigDecimal getDataValue() {
        return dataValue;
    }

    @Override
    public void setDataValue(BigDecimal dataValue) {
        this.dataValue = dataValue;
    }

    @Override
    public Long getRuleStatisticsId() {
        return ruleStatisticsId;
    }

    @Override
    public void setRuleStatisticsId(Long ruleStatisticsId) {
        this.ruleStatisticsId = ruleStatisticsId;
    }

    @Override
    public String getStatisticsValue() {
        return statisticsValue;
    }

    @Override
    public void setStatisticsValue(String statisticsValue) {
        this.statisticsValue = statisticsValue;
    }
}