package com.hillstone.dsgp.asset.datasource.plugin.interf.file.field.entity.model;

import com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.model.BaseArchitectureDataAssetModel;
import lombok.Data;

/**
 * @author liqiang
 * @date 2024/3/20
 */
@Data
public abstract class BaseFieldModel extends BaseArchitectureDataAssetModel {

    /**
     * 注释
     */
    private String comment;
}
