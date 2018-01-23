package com.umf.b2b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UmfB2bConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmfB2bConfigClientApplication.class, args);
	}
}
