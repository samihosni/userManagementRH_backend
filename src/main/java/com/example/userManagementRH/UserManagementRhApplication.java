package com.example.userManagementRH;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class UserManagementRhApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementRhApplication.class, args);
	}

}
