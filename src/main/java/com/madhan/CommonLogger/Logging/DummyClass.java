package com.madhan.CommonLogger.Logging;

import org.springframework.stereotype.Component;

@Component

public class DummyClass {

    private final CommonLogger logger = CommonLoggerFactory.getLogger(DummyClass.class);
    public void createUser(String username) {
        logger.info("Creating user: " + username);

        // Simulate logic
        try {
            // Some logic here
            logger.debug("User creation logic executed for: " + username);
        } catch (Exception e) {
            logger.error("Error creating user: " + e.getMessage());
        }
    }


}
