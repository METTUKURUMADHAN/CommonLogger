package com.madhan.CommonLogger.Logging;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class LoggerConfig {

    @Value("${logger.type:logback}")
    private String loggerType;

    @PostConstruct
    public void init() {
        CommonLoggerFactory.setLoggerType(loggerType);
    }
}
