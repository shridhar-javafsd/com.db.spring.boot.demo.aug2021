package com.db.spring.boot.demo.aug2021;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

@SpringBootApplication
public class Application {

	// LOGGING -

	private static final Logger LOG = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		LOG.info("Start");

		SpringApplication.run(Application.class, args);
	}

}
