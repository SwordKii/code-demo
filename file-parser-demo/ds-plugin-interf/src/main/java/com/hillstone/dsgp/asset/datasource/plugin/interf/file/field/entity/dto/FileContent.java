package com.hillstone.dsgp.asset.datasource.plugin.interf.file.field.entity.dto;

import com.hillstone.dsgp.asset.datasource.plugin.interf.file.architecture.entity.dto.FileArchitecture;
import lombok.Data;

import java.io.InputStream;

/**
 * @author liqiang
 * @date 2024/3/20
 */
@Data
public class FileContent extends FileArchitecture {
    /**
     * 文件的输入流，用于获取文件内容
     */
    private InputStream inputStream;
}
