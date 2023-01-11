package com.adhara.store;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class AdharaStoreApplication {
    private static final Logger LOGGER = LogManager.getLogger(AdharaStoreApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Starting Adhara Brows Store application...");
        SpringApplication.run(AdharaStoreApplication.class, args);
    }
}
