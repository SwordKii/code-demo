package com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.qo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * table查询参数
 *
 * @author wangjian2
 * @date 2024/3/13 14:01
 */
@Setter
@Getter
@ToString(callSuper = true)
public class TableNameQO {
    /**
     * table名称
     */
    private String table;
    /**
     * schema名称
     */
    private String schema;
    /**
     * catalog名称
     */
    private String catalog;
}
