package com.hillstone.dsgp.asset.datasource.plugin.interf.file.architecture.entity.dto;

import com.hillstone.dsgp.asset.datasource.plugin.interf.file.architecture.entity.model.BaseFileSystemModel;
import com.hillstone.dsgp.asset.datasource.plugin.interf.file.enums.FileTypeEnum;
import lombok.Data;

/**
 * @author liqiang
 * @date 2024/3/20
 */
@Data
public class FileArchitecture extends BaseFileSystemModel {

    /**
     * 类型：文件/目录
     */
    private FileTypeEnum type;

    /**
     * 文件大小
     */
    private Long size;
}
