package com.forex.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages={"com.forex"})
@EnableDiscoveryClient
public class ForexClient {

	public static void main(String[] args) {
		SpringApplication.run(ForexClient.class, args);

	}

}
