package com.bridgelabz.fundoonotes.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FundoonotesEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundoonotesEurekaServerApplication.class, args);
	}
}
