package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.VO.ResponseValueObject;
import com.example.entity.UserEntity;
import com.example.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController 
{
	@Autowired
	public UserService service;
	
	@PostMapping("/saveuser")
	public UserEntity saveUser(@RequestBody UserEntity model)
	{
		return service.saveUser(model);
	}
	
	@GetMapping("/getallusers")
	public List<UserEntity> getAllUsers()
	{
		return service.getAllUsers();
	}
	
	@GetMapping("getuserwithdepartment/{id}")
	public ResponseValueObject getUserWithDepartment(@PathVariable("id") int userId)
	{
		return service.getUserWithDepartment(userId);
	}
	
}
