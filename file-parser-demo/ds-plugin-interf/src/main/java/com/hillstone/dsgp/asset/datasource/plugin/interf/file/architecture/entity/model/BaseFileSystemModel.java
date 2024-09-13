package com.hillstone.dsgp.asset.datasource.plugin.interf.file.architecture.entity.model;

import com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.model.BaseArchitectureDataAssetModel;
import lombok.Data;

/**
 * @author liqiang
 * @date 2024/3/20
 */
@Data
public abstract class BaseFileSystemModel extends BaseArchitectureDataAssetModel {

    /**
     * 文件父目录，从根路径开始的完整路径，例如：/a/b/c
     */
    private String fullDirectory;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 修改时间
     */
    private Long modifyTime;


}
