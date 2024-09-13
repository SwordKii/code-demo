package com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.dto;

import com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.model.BaseColumnModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * column架构
 *
 * @author wangjian2
 * @date 2024/3/9 10:46
 */
@Setter
@Getter
@ToString(callSuper = true)
public class ColumnArchitecture extends BaseColumnModel {
    /**
     * 所属catalog
     */
    private String catalog;
    /**
     * 所属schema
     */
    private String schema;
    /**
     * 所属table
     */
    private String table;
}
