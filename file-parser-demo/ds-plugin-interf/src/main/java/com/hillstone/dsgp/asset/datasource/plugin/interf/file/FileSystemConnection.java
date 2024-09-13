package com.hillstone.dsgp.asset.datasource.plugin.interf.file;

import com.hillstone.dsgp.asset.datasource.plugin.interf.common.DataSourceConnection;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception.ExecutionException;
import com.hillstone.dsgp.asset.datasource.plugin.interf.file.architecture.entity.dto.FileArchitecture;
import com.hillstone.dsgp.asset.datasource.plugin.interf.file.architecture.entity.qo.DirectoryQO;
import com.hillstone.dsgp.asset.datasource.plugin.interf.file.architecture.entity.qo.FileQO;
import java.io.InputStream;
import java.util.List;

/**
 * 文件操作接口
 * <p>所有文件类数据源插件必须实现本接口，并添加到插件配置信息中</p>
 *
 * @author wangjian2
 * @date 2024/3/9 12:26
 */
public interface FileSystemConnection extends DataSourceConnection {


    /**
     * 获取文件/目录信息
     *
     * @param directoryQO
     * @return
     * @throws ExecutionException
     */
    List<FileArchitecture> getFiles(DirectoryQO directoryQO) throws ExecutionException;

    /**
     * 获取文件内容
     *
     * @param fileQO
     * @return
     * @throws ExecutionException
     */
    InputStream getFileInputStream(FileQO fileQO) throws ExecutionException;

}
