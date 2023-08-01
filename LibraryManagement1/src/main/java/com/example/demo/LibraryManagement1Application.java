package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example.librarymanagement.*"
		})
@EntityScan("com.example.librarymanagement.model")
@EnableJpaRepositories(basePackages="com.example.librarymanagement.repository")
@EnableTransactionManagement
@SpringBootApplication
public class LibraryManagement1Application {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagement1Application.class, args);
	}

}
