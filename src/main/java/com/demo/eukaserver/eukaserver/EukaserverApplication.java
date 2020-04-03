package com.demo.eukaserver.eukaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EukaserverApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(EukaserverApplication.class, args);
	}
}