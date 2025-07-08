package com.madhan.CommonLogger.Logging;

import com.madhan.CommonLogger.Logging.CommonLogger;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


public class CommonLoggerFactory {

    private static volatile String loggerType = "logback"; // default
    private static final ConcurrentMap<Class<?>, CommonLogger> loggerMap = new ConcurrentHashMap<>();

    private CommonLoggerFactory() {}

    public static synchronized void setLoggerType(String type) {
        if (type != null && !type.isEmpty() && !type.equalsIgnoreCase(loggerType)) {
            loggerType = type.toLowerCase();
            loggerMap.clear(); // clear cached loggers so new type is applied
        }
    }

    public static CommonLogger getLogger(Class<?> clazz) {
        return loggerMap.computeIfAbsent(clazz, CommonLoggerFactory::createLogger);
    }

    private static CommonLogger createLogger(Class<?> clazz) {
        switch (loggerType) {
            case "commons": return new CommonsLoggerAdapter(clazz);
            case "log4j2": return new Log4j2LoggerAdapter(clazz);
            case "logback": return new LogbackLoggerAdapter(clazz);
            case "slf4j": return new Slf4jLoggerAdapter(clazz);
            default:
                System.err.println("Warning: Unknown logger type '" + loggerType + "', using SLF4J as default.");
                return new Slf4jLoggerAdapter(clazz);
        }
    }
}
