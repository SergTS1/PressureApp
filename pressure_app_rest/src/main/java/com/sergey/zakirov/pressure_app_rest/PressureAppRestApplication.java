package com.sergey.zakirov.pressure_app_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class PressureAppRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PressureAppRestApplication.class, args);
	}

}
