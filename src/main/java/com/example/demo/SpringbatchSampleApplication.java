package com.example.demo;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing //배치 기능활성화
public class SpringbatchSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbatchSampleApplication.class, args);
	}

}
