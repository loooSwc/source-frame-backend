package com.sframe.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SframeEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SframeEurekaApplication.class, args);
	}

}
