package com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception;

/**
 * 插件执行时异常
 *
 * @author wangjian2
 * @date 2024/4/2 17:38
 */
public class ExecutionException extends PluginException {
    public ExecutionException(String message) {
        super(message);
    }

    public ExecutionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExecutionException(Throwable cause) {
        super(cause);
    }
}
