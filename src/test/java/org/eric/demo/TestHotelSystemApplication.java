package org.eric.demo;

import org.springframework.boot.SpringApplication;

public class TestHotelSystemApplication {

	public static void main(String[] args) {
		SpringApplication.from(HotelSystemApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
