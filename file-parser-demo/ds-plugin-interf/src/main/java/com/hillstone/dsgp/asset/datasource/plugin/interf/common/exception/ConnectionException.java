package com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception;

/**
 * 数据源连接类异常
 *
 * @author wangjian2
 * @date 2024/4/2 17:36
 */
public class ConnectionException extends PluginException {
    public ConnectionException(String message) {
        super(message);
    }

    public ConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConnectionException(Throwable cause) {
        super(cause);
    }
}
