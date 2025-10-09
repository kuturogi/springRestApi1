package com.bertugkuturoglu.spring_rest_api1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.bertugkuturoglu"})
@SpringBootApplication
public class SpringRestApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApi1Application.class, args);
	}

}
