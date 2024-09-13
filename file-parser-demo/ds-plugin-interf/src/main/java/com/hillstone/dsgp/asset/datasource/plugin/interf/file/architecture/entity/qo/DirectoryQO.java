package com.hillstone.dsgp.asset.datasource.plugin.interf.file.architecture.entity.qo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liqiang
 * @date 2024/4/1
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DirectoryQO {

    /**
     * 完整目录名，以/进行分割
     */
    private String fullDirectory;
}
