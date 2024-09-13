package com.hillstone.dsgp.asset.datasource.plugin.interf.file;

import com.hillstone.dsgp.asset.datasource.plugin.interf.common.entity.DataSourceConnectionParam;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.DataSourceDriver;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception.AuthenticationException;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception.CommunicationException;

/**
 * 文件系统类Driver
 *
 * @author wangjian2
 * @date 2024/3/14 15:37
 */
public interface FileSystemDriver extends DataSourceDriver {
    /**
     * 获取连接
     * <p>尽量识别并抛出声明的异常，以便业务提示用户</p>
     *
     * @param connectionParam
     * @return
     * @throws CommunicationException
     * @throws AuthenticationException
     */
    FileSystemConnection connect(DataSourceConnectionParam connectionParam) throws CommunicationException, AuthenticationException;
}