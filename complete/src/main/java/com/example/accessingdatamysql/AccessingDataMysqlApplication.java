package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataMysqlApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataMysqlApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setName("John");
		user.setEmail("john@example.com");
		userRepository.save(user);
	}
}
