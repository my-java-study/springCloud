package com.umf.b2b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class UmfB2bFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmfB2bFeignClientApplication.class, args);
	}
}
