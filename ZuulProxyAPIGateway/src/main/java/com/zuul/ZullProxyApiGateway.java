package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication(scanBasePackages={"com.zuul"})
@EnableZuulProxy
public class ZullProxyApiGateway {

	public static void main(String[] args) {
		SpringApplication.run(ZullProxyApiGateway.class, args);

	}

}
