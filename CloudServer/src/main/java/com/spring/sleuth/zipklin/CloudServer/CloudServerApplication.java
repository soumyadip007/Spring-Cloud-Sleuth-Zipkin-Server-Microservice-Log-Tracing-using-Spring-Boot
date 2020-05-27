package com.spring.sleuth.zipklin.CloudServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@ComponentScan({"com.spring.sleuth.zipklin.*"})
@EntityScan("com.spring.sleuth.zipklin.*")
public class CloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServerApplication.class, args);
	}

}
