package com.zup.apirestexterna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApirestexternaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestexternaApplication.class, args);
	}

}
