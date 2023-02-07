package com.cloudstudy.msconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer
public class MsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsConfigServerApplication.class, args);
	}

}
