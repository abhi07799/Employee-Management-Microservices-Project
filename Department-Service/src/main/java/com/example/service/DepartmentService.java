package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.DepartmentEntity;
import com.example.repository.DepartmentRepository;

import jakarta.annotation.PostConstruct;

@Service
public class DepartmentService 
{
	@Autowired
	DepartmentRepository repo;
	
	@PostConstruct
	private void dbInit()
	{
		DepartmentEntity dep1 = new DepartmentEntity("Tokyo, Japan","Research","R001");
		repo.save(dep1);
		DepartmentEntity dep2 = new DepartmentEntity("Osaka, Japan","Development","D001");
		repo.save(dep2);
		DepartmentEntity dep3 = new DepartmentEntity("Kyoto, Japan","Sales","S001");
		repo.save(dep3);
	}
	
	public DepartmentEntity saveDepartment(DepartmentEntity model)
	{
		return repo.save(model);
	}
	
	public DepartmentEntity getDepartmentByCode(String depCode)
	{
		return repo.findByDepartmentCode(depCode);
	}
	
	public List<DepartmentEntity> getAllDepartments()
	{
		return repo.findAll();
	}
}
