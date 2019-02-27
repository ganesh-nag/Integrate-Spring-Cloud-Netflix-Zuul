package com.ccs.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"com.ccs"})
@EnableFeignClients("com.ccs.iface")
public class CurrencyConversionClient {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionClient.class, args);

	}

}
