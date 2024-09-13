package com.example.fileparserdemo.biz.plugin;

import com.hillstone.dsgp.asset.datasource.plugin.interf.common.entity.DataSourceConnectionParam;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception.AuthenticationException;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception.CommunicationException;
import com.hillstone.dsgp.asset.datasource.plugin.interf.file.FileSystemConnection;
import com.hillstone.dsgp.asset.datasource.plugin.interf.file.FileSystemDriver;

/**
 * todo
 *
 * @author wangjian2
 * @date 2024/9/10 17:37
 */
public class LocalFileSystemDriver implements FileSystemDriver {

    @Override
    public FileSystemConnection connect(DataSourceConnectionParam dataSourceConnectionParam) throws CommunicationException, AuthenticationException {
        // 本地文件系统，不需要连接参数
        return new LocalFileSystemConnection();
    }

    @Override
    public boolean acceptVersion(String s) {
        return true;
    }
}
