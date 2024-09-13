package com.hillstone.dsgp.asset.datasource.plugin.interf.file.field.entity.dto;

import com.hillstone.dsgp.asset.datasource.plugin.interf.file.field.entity.model.BaseFieldModel;
import lombok.Data;

/**
 * @author liqiang
 * @date 2024/3/20
 */
@Data
public class FileField extends BaseFieldModel {

    /**
     * 所属目录
     */
    private String directory;

    /**
     * 所属完整目录
     */
    private String fullDirectory;

    /**
     * 所属文件
     */
    private String file;
}
