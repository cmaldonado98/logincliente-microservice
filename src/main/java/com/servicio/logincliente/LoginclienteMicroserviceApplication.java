package com.servicio.logincliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LoginclienteMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginclienteMicroserviceApplication.class, args);
	}

}
