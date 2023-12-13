package com.ikn.rms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RMServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RMServiceRegistryApplication.class, args);
	}

}
