package com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.dto;

import com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.model.BaseSchemaModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * schema架构
 *
 * @author wangjian2
 * @date 2024/3/9 10:35
 */
@Setter
@Getter
@ToString(callSuper = true)
public class SchemaArchitecture extends BaseSchemaModel {
    /**
     * 所属catalog名称
     */
    private String catalog;
}
