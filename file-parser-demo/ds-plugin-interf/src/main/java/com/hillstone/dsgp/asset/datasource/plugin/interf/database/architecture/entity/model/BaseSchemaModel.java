package com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * schema基类
 *
 * @author wangjian2
 * @date 2024/3/8 19:23
 */
@Setter
@Getter
@ToString(callSuper = true)
public abstract class BaseSchemaModel extends BaseArchitectureDataAssetModel {
}
