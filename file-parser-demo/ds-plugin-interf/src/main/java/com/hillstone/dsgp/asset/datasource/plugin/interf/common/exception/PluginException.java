package com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception;

/**
 * 数据源插件异常类
 *
 * @author wangjian2
 * @date 2024/4/2 17:26
 */
public class PluginException extends RuntimeException {
    public PluginException(String message) {
        super(message);
    }

    public PluginException(String message, Throwable cause) {
        super(message, cause);
    }

    public PluginException(Throwable cause) {
        super(cause);
    }

    public static PluginException throwExactPluginException(Throwable e) {
        if (e instanceof CommunicationException) {
            throw (CommunicationException) e;
        } else if (e instanceof AuthenticationException) {
            throw (AuthenticationException) e;
        } else if (e instanceof UnSupportedException) {
            throw (UnSupportedException) e;
        } else if (e instanceof ReachedMaxConnectionsException) {
            throw (ReachedMaxConnectionsException) e;
        } else if (e instanceof PermissionException) {
            throw (PermissionException) e;
        } else if (e instanceof ConnectionException) {
            throw (ConnectionException) e;
        } else if (e instanceof ExecutionException) {
            throw (ExecutionException) e;
        } else if (e instanceof PluginException) {
            throw (PluginException) e;
        }
        return new PluginException(e);
    }
}
