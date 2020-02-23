package com.yc.C71S3Tstsmuisc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;


@SpringBootApplication

public class C71S3TstsmuiscApplication {
	public static void main(String[] args) {
		SpringApplication.run(C71S3TstsmuiscApplication.class, args);
	}

	@Bean
	public ServerEndpointExporter ServerEndpointExporter() {
		return new ServerEndpointExporter();
	}
}
