package com.malik.gatesstausmvn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class GatesStausMvnApplication {

	public static void main(String[] args) {

		SpringApplication.run(GatesStausMvnApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
		log.error(String.format("Hello %s!", name));
		return String.format("Hello %s!", name);
	}

}
