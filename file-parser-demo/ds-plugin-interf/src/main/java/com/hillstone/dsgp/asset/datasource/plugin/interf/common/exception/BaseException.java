package com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception;

/**
 *
 * @author wangjian2
 * @date 2024/8/19 11:32
 */

public class BaseException extends RuntimeException {
    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }
}
