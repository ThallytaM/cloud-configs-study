package com.cloudstudy.studyeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
class StudyEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyEurekaServerApplication.class, args);
	}

}
