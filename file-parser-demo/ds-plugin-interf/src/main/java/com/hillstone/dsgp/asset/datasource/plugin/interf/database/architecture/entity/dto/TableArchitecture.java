package com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.dto;

import com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.model.BaseTableModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * table架构
 *
 * @author wangjian2
 * @date 2024/3/9 10:44
 */
@Setter
@Getter
@ToString(callSuper = true)
public class TableArchitecture extends BaseTableModel {
    /**
     * 所属catalog
     */
    private String catalog;
    /**
     * 所属schema
     */
    private String schema;
}
