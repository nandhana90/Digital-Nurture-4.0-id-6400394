package com.Cognizant.sprintg_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SprintgLearnApplicationTests {
	private static final Logger LOGGER = LoggerFactory.getLogger(SprintgLearnApplication.class);

	public static void main(String[] args) {
		LOGGER.info("START");
		SpringApplication.run(SprintgLearnApplication.class, args);
		LOGGER.info("END");
	
	}
}
