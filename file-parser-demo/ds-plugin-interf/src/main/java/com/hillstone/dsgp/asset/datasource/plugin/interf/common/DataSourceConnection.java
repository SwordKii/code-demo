package com.hillstone.dsgp.asset.datasource.plugin.interf.common;

import com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception.AuthenticationException;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception.CommunicationException;

/**
 * 数据源操作接口
 *
 * @author wangjian2
 * @date 2024/3/9 12:26
 */
public interface DataSourceConnection extends AutoCloseable {
    /**
     * 测试连接
     * <p>尽量识别并抛出声明的异常，以便业务提示用户</p>
     *
     * @return
     * @throws CommunicationException
     * @throws AuthenticationException
     */
    boolean testConnection() throws CommunicationException, AuthenticationException;
}