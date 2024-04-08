package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.VO.DepartmentVO;
import com.example.VO.ResponseValueObject;
import com.example.entity.UserEntity;
import com.example.repository.UserRepository;

import jakarta.annotation.PostConstruct;

@Service
public class UserService 
{
	@Autowired
	public UserRepository repo;
	
	@Autowired
	public RestTemplate restTemplate;
	
	@PostConstruct
	private void dbInit()
	{
		UserEntity user1 = new UserEntity("Goku","goku@dragonball.com","9876543210","D001");
		repo.save(user1);
		UserEntity user2 = new UserEntity("Gohan","gohan@dragonball.com","632145789","R001");
		repo.save(user2);
		UserEntity user3 = new UserEntity("Vegeta","vegeta@dragonball.com","9987654512","S001");
		repo.save(user3);
	}
	
	public UserEntity saveUser(UserEntity model)
	{
		return repo.save(model);
	}
	
	public List<UserEntity> getAllUsers()
	{
		return repo.findAll();
	}

	public ResponseValueObject getUserWithDepartment(int userId) 
	{
		ResponseValueObject response = new ResponseValueObject();
		
		UserEntity user = repo.findByUserId(userId);
		
		DepartmentVO department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/getdepartmentbycode/"+user.getDepartmentCode(), DepartmentVO.class);
		
		response.setUser(user);
		response.setDepartment(department);
		return response;
	}
	
	
}
