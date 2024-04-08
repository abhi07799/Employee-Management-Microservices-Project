package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController 
{
	@GetMapping("/userservicefallback")
	public String userServiceFallBackMethod()
	{
		return "User Service is undder maintainance. Please come back later!!";
	}
	
	@GetMapping("/departmentservicefallback")
	public String departmentServiceFallBackMethod()
	{
		return "Department Service is undder maintainance. Please come back later!!";
	}
}
