package com.galaxy.zipkin.zipkinall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo/*.xml"})
public class ZipkinAllApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinAllApplication.class, args);
	}
}
