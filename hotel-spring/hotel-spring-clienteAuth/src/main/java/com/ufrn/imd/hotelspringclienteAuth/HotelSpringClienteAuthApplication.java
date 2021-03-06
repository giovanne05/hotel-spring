package com.ufrn.imd.hotelspringclienteAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HotelSpringClienteAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelSpringClienteAuthApplication.class, args);
	}

}
