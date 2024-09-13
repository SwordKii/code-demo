package com.hillstone.dsgp.asset.datasource.plugin.interf.file.sampling.entity.dto;

import lombok.Data;

import java.util.List;

/**
 * @author liqiang
 * @date 2024/3/28
 */
@Data
public class FileSystemSampleData {

    private String fileName;
    private String fullDirectory;
    private String fileField;
    private List<Object> cells;
}
