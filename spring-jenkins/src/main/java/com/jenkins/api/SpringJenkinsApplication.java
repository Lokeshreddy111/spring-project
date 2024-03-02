package com.jenkins.api;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger= LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void intt() {
		logger.info("aplication started");
	}
	public static void main(String[] args) {
		logger.info("aplication exicuted");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
