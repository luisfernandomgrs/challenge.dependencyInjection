package com.learning.challengedependencyinjection.App;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeDependencyInjectionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeDependencyInjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Implementation to use CommandLineRunner");
	}
}
