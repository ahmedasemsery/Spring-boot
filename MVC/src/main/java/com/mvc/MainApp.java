package com.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MainApp {
//public class MainApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	}

}
