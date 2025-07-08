package com.madhan.CommonLogger.Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4j2LoggerAdapter implements CommonLogger {


    private final Logger logger;

    public Log4j2LoggerAdapter(Class<?> clazz) {
        this.logger = LogManager.getLogger(clazz);
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


