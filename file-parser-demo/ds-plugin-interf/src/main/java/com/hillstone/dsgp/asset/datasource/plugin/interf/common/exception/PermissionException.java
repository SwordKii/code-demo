package com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception;

/**
 * 权限异常
 *
 * @author wangjian2
 * @date 2024/4/10 16:22
 */
@SuppressWarnings("java:S110")
public class PermissionException extends ExecutionException{
    public PermissionException(String message) {
        super(message);
    }

    public PermissionException(String message, Throwable cause) {
        super(message, cause);
    }

    public PermissionException(Throwable cause) {
        super(cause);
    }
}
