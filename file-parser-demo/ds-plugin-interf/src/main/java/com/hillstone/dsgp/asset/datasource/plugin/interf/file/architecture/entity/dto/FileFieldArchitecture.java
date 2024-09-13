package com.hillstone.dsgp.asset.datasource.plugin.interf.file.architecture.entity.dto;


import com.hillstone.dsgp.asset.datasource.plugin.interf.database.architecture.entity.model.BaseArchitectureDataAssetModel;
import lombok.Data;

/**
 * @author liqiang
 * @date 2024/3/20
 */
@Data
public class FileFieldArchitecture extends BaseArchitectureDataAssetModel {

    /**
     * 所属完整目录
     */
    private String fullDirectory;

    /**
     * 字段所在文件名
     */
    private String fileName;

    /**
     * 注释
     */
    private String comment;

}
