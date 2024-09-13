package com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception;

/**
 * 兼容性异常
 * <p>如版本不支持等</p>
 * @author hlyang
 * @date 2024/5/28
 * @description
 */
@SuppressWarnings("java:S110")
public class UnSupportedException extends ConnectionException {
    public UnSupportedException(String message) {
        super(message);
    }

    public UnSupportedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnSupportedException(Throwable cause) {
        super(cause);
    }
}
