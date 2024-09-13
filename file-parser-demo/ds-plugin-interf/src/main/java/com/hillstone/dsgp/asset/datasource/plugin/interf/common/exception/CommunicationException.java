package com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception;

/**
 * 连接异常
 * <p>网络不可达</p>
 *
 * @author wangjian2
 * @date 2024/4/2 17:29
 */
@SuppressWarnings("java:S110")
public class CommunicationException extends ConnectionException {
    public CommunicationException(String message) {
        super(message);
    }

    public CommunicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommunicationException(Throwable cause) {
        super(cause);
    }
}
