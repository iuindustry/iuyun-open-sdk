package com.iuyun.open.model.request.collection;

import java.math.BigDecimal;

public interface CollectData {

    /**
     * @return 设备数据DataCode
     */
    String getDataCode();

    /**
     * @param dataCode 设备数据DataCode
     */
    void setDataCode(String dataCode);

    /**
     * @return 数据采集时间
     */
    String getDataTime();

    /**
     * @param dataTime 数据采集时间
     */
    void setDataTime(String dataTime);

    /**
     * @return 数据值
     */
    BigDecimal getDataValue();

    /**
     * @param dataValue 数据值
     */
    void setDataValue(BigDecimal dataValue);

    /**
     * @return 数据统计规则id
     */
    Long getRuleStatisticsId();

    /**
     * @param ruleStatisticsId 数据统计规则id
     */
    void setRuleStatisticsId(Long ruleStatisticsId);

    /**
     * @return 数据统计后的值
     */
    String getStatisticsValue();

    /**
     * @param statisticsValue 数据统计后的值
     */
    void setStatisticsValue(String statisticsValue);
}
