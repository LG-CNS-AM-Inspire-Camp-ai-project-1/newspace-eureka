package com.lgcns.newspaceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NewspaceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewspaceEurekaServerApplication.class, args);
	}

}
