package com.umf.b2b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class UmfB2bEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmfB2bEurekaApplication.class, args);
	}
}
