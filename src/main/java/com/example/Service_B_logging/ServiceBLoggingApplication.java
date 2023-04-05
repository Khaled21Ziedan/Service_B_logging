package com.example.Service_B_logging;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServiceBLoggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceBLoggingApplication.class, args);
	}

}
