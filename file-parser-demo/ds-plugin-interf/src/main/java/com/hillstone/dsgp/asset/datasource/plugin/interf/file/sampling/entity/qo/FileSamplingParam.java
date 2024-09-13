package com.hillstone.dsgp.asset.datasource.plugin.interf.file.sampling.entity.qo;

import lombok.Data;

import java.util.List;

/**
 * 数据采样架构信息
 *
 * @author wangjian2
 * @date 2024/3/9 14:57
 */
@Data
public class FileSamplingParam {

    private String fileName;
    private String fullDirectory;
    private List<String> fileFields;
    /**
     * 采样数量
     */
    private Integer count;
}
