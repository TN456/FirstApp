package com.springboot.controller;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
	
	@GetMapping("/hello")
	@RolesAllowed("admin")
	public String getMessage() {
		return "Hello World in Spring Boot Application!!!";
	}
}
