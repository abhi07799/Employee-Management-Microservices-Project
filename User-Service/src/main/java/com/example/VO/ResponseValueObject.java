package com.example.VO;

import com.example.entity.UserEntity;

public class ResponseValueObject 
{
	private UserEntity user;
	private DepartmentVO department;
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}
	public DepartmentVO getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentVO department) {
		this.department = department;
	}
}
