package com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 数据源架构资产基类
 *
 * @author wangjian2
 * @date 2024/3/8 19:25
 */
@Setter
@Getter
@ToString(callSuper = true)
public abstract class BaseArchitectureDataAssetModel {
    private String name;
}
