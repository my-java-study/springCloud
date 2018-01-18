package com.umf.b2b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 不管是服务提供方还是消费方，对服务注册中心来说都是客户端
 */
@EnableDiscoveryClient
@SpringBootApplication
public class UmfB2bCrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmfB2bCrmApplication.class, args);
	}
}
