package com.iuyun.open.model.request.collection;

import com.iuyun.open.model.request.BaseRequest;

import java.math.BigDecimal;

public class CollectDataRequest extends BaseRequest {

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

    public String getDataCode() {
        return dataCode;
    }

    public void setDataCode(String dataCode) {
        this.dataCode = dataCode;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public BigDecimal getDataValue() {
        return dataValue;
    }

    public void setDataValue(BigDecimal dataValue) {
        this.dataValue = dataValue;
    }

    public Long getRuleStatisticsId() {
        return ruleStatisticsId;
    }

    public void setRuleStatisticsId(Long ruleStatisticsId) {
        this.ruleStatisticsId = ruleStatisticsId;
    }

    public String getStatisticsValue() {
        return statisticsValue;
    }

    public void setStatisticsValue(String statisticsValue) {
        this.statisticsValue = statisticsValue;
    }
}
