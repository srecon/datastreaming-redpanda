package com.blu.streaming.redpandaproducer;

import com.blu.streaming.redpandaproducer.services.ProducerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedpandaProducerApplication implements CommandLineRunner {
	//private static final Logger logger = LoggerFactory.getLogger(RedpandaProducerApplication.class);
	@Autowired
	private ProducerServices service;
	public static void main(String[] args) {
		//logger.info("Producer with Kafka API started!!");
		SpringApplication.run(RedpandaProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.sendMessage();
		//logger.info("Sent message!");
	}
}
