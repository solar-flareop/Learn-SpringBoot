package com.solarflare.spring_basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicConceptsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicConceptsApplication.class, args);
	}

	@Autowired
	CakeBaker cakeBaker;

	@Override
	public void run(String... args) throws Exception {
		cakeBaker.bakeCake();
	}
}
