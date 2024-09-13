package com.hillstone.dsgp.asset.datasource.plugin.interf.common.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 数据源架构描述
 *
 * @author wangjian2
 * @date 2024/3/18 17:55
 */
@Setter
@Getter
@ToString(callSuper = true)
@JsonPropertyOrder({"catalog", "schema", "table", "column"})
public class ArchitectureDesc {
    private I18nDesc catalog;
    private I18nDesc schema;
    private I18nDesc table;
    private I18nDesc column;
}
