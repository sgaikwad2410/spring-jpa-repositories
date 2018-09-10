package com.springprojects.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.springprojects.dto")
@EnableJpaRepositories( basePackages = "com.springprojects.repo")
@ComponentScan( basePackages = " com.springprojects.*")
@SpringBootApplication
public class SpringJpaRepositoriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaRepositoriesApplication.class, args);
	}
}
