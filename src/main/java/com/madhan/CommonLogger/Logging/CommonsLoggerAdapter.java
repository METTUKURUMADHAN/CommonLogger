package com.madhan.CommonLogger.Logging;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;


public class CommonsLoggerAdapter implements CommonLogger{

    private final Log logger;

    public CommonsLoggerAdapter(Class<?> clazz) {
        this.logger = LogFactory.getLog(clazz);
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
        logger.fatal(msg);
    }

    @Override
    public void fatal(String msg, Throwable t) {
        logger.fatal(msg, t);
    }
}
