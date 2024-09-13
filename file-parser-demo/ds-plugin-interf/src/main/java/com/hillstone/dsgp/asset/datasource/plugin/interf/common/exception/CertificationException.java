package com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception;

/**
 * 证书异常
 *
 * @author wangjian2
 * @date 2024/3/13 9:44
 */
public class CertificationException extends RuntimeException{
    public CertificationException() {
        super();
    }

    public CertificationException(String message) {
        super(message);
    }

    public CertificationException(String message, Throwable cause) {
        super(message, cause);
    }

    public CertificationException(Throwable cause) {
        super(cause);
    }
}
