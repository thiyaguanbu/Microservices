package com.perfm.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PerfmGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerfmGatewayServiceApplication.class, args);
	}

}

