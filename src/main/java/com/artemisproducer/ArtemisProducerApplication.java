package com.artemisproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ArtemisProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtemisProducerApplication.class, args);
	}

}
