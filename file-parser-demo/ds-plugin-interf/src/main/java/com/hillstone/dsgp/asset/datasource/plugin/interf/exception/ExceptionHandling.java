package com.hillstone.dsgp.asset.datasource.plugin.interf.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author jxwu
 */
public class ExceptionHandling {

    private static final Logger log = LoggerFactory.getLogger(ExceptionHandling.class);

    private ExceptionHandling() {
    }

    public static <T, E extends RuntimeException> T execute(Callable<T> task, Function<Throwable, E> exception) {
        try {
            return task.call();
        } catch (Exception e) {
            throw exception.apply(e);
        }
    }

    public static <T> T swallowException(Callable<T> task, Supplier<T> supplier) {
        try {
            return task.call();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return supplier.get();
        }
    }
}
