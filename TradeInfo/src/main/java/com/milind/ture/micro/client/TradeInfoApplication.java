package com.milind.ture.micro.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TradeInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeInfoApplication.class, args);
	}

}
