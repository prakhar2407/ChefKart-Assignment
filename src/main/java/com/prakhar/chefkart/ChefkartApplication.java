package com.prakhar.chefkart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class ChefkartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChefkartApplication.class, args);
	}

}
