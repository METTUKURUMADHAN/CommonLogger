package com.madhan.CommonLogger.Logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Slf4jLoggerAdapter implements CommonLogger {

    private final Logger logger;

    public Slf4jLoggerAdapter(Class<?> clazz) {
        this.logger = LoggerFactory.getLogger(clazz);
    }

    @Override
    public void trace(String msg) {
        logger.trace(msg);

    }

    @Override
    public void trace(String msg, Throwable t) {
        logger.trace(msg, t);
    }

    @Override
    public void debug(String msg) {
        logger.debug(msg);
    }

    @Override
    public void debug(String msg, Throwable t) {
        logger.debug(msg, t);
    }

    @Override
    public void info(String msg) {

        logger.info(msg);

    }

    @Override
    public void info(String msg, Throwable t) {

        logger.info(msg, t);
    }

    @Override
    public void warn(String msg) {
        logger.warn(msg);
    }

    @Override
    public void warn(String msg, Throwable t) {
        logger.warn(msg, t);
    }

    @Override
    public void error(String msg) {
        logger.error(msg);
    }

    @Override
    public void error(String msg, Throwable t) {
        logger.error(msg, t);
    }

    @Override
    public void fatal(String msg) {
        logger.error(msg);
    }

    @Override
    public void fatal(String msg, Throwable t) {
        logger.error(msg, t);
    }

}
