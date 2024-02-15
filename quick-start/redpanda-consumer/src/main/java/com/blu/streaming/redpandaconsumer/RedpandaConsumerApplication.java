package com.blu.streaming.redpandaconsumer;

import com.blu.streaming.redpandaconsumer.services.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedpandaConsumerApplication {

	@Autowired
	private ConsumerService service;
	public static void main(String[] args) {
		SpringApplication.run(RedpandaConsumerApplication.class, args);
	}

}
