package com.hillstone.dsgp.asset.datasource.plugin.interf.database;

import com.hillstone.dsgp.asset.datasource.plugin.interf.common.DataSourceDriver;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.entity.DataSourceConnectionParam;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception.AuthenticationException;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception.CommunicationException;

/**
 * 数据库类型Driver
 *
 * @author wangjian2
 * @date 2024/3/14 15:23
 */
public interface DataBaseDriver extends DataSourceDriver {
    /**
     * 获取连接
     * <p>尽量识别并抛出声明的异常，以便业务提示用户</p>
     *
     * @param connectionParam
     * @return
     * @throws CommunicationException
     * @throws AuthenticationException
     */
    DataBaseConnection connect(DataSourceConnectionParam connectionParam) throws CommunicationException, AuthenticationException;
}