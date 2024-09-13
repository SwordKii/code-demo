package com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.qo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * schema名称
 *
 * @author wangjian2
 * @date 2024/3/13 13:59
 */
@Setter
@Getter
@ToString(callSuper = true)
public class SchemaNameQO {
    /**
     * schema名称
     */
    private String schema;
    /**
     * catalog名称
     */
    private String catalog;
}
