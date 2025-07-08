package com.madhan.CommonLogger;

import com.madhan.CommonLogger.Logging.DummyClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CommonLoggerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(CommonLoggerApplication.class, args);

		DummyClass dummyClass = context.getBean(DummyClass.class);

		dummyClass.createUser("madhan");
	}

}
