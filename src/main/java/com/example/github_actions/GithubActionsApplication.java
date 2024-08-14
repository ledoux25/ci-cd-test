package com.example.github_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome ledoux";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubActionsApplication.class, args);
	}

}
