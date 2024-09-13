package com.example.filepaserdemo.fileparsers.interf.exception;

/**
 * todo
 *
 * @author wangjian2
 * @date 2024/9/11 16:37
 */
public class ParserException extends RuntimeException {

    public ParserException() {
        super();
    }

    public ParserException(String message) {
        super(message);
    }

    public ParserException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParserException(Throwable cause) {
        super(cause);
    }
}
