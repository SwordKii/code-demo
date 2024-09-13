package com.hillstone.dsgp.asset.datasource.plugin.interf.file.architecture.entity.qo;

import lombok.Data;

/**
 * @author liqiang
 * @date 2024/4/1
 */
@Data
public class FileQO {

    /**
     * 文件名
     */
    private String name;

    /**
     * 完整目录名，以/进行分割
     */
    private DirectoryQO directory;
}
