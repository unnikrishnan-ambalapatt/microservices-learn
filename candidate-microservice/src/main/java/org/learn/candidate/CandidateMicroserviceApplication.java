package org.learn.candidate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CandidateMicroserviceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CandidateMicroserviceApplication.class, args);
	}

}
