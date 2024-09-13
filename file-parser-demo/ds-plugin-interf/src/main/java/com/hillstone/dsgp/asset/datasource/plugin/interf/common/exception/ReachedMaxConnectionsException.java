package com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception;


/**
 * 创建连接时达到数据库最大连接数异常
 *
 * @author dengliu
 * @date 2024/7/12
 * @description
 */
@SuppressWarnings("java:S110")
public class ReachedMaxConnectionsException extends ConnectionException {
    public ReachedMaxConnectionsException(String message) {
        super(message);
    }

    public ReachedMaxConnectionsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReachedMaxConnectionsException(Throwable cause) {
        super(cause);
    }
}
