package com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception;

/**
 * 认证异常
 * <p>如用户名/密码错误、token错误等</p>
 *
 * @author wangjian2
 * @date 2024/4/2 17:31
 */
@SuppressWarnings("java:S110")
public class AuthenticationException extends ConnectionException {
    public AuthenticationException(String message) {
        super(message);
    }

    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthenticationException(Throwable cause) {
        super(cause);
    }
}
