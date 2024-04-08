package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.DepartmentEntity;
import com.example.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController 
{
	@Autowired
	DepartmentService depService;
	
	@GetMapping("/test")
	public String testController()
	{
		return "Working";
	}
	
	@PostMapping("/savedepartment")
	public DepartmentEntity saveDepartment(@RequestBody DepartmentEntity model)
	{
		return depService.saveDepartment(model);
	}
	
	@GetMapping("/getdepartmentbycode/{code}")
	public DepartmentEntity getDepartmentByCode(@PathVariable("code") String depCode)
	{
		return depService.getDepartmentByCode(depCode);
	}
	
	@GetMapping("/getalldepartments")
	public List<DepartmentEntity> getAllDepartments()
	{
		return depService.getAllDepartments();
	}
}
