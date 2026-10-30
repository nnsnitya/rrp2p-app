package com.po;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestClient;

@SpringBootApplication
@EnableScheduling
public class Rrp2pPoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Rrp2pPoServiceApplication.class, args);
	}

    @Bean
    public RestClient.Builder restClientBuilder() {
        return RestClient.builder();
    }
}
