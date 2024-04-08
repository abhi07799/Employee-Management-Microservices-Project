package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departments")
public class DepartmentEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "department_")
	private int id;
	
	@Column(name = "department_name")
	private String departmentName;
	
	@Column(name = "department_address")
	private String departmentAddress;
	
	@Column(name = "department_code")
	private String departmentCode;

	public DepartmentEntity(String departmentName, String departmentAddress, String departmentCode) {
		super();
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public DepartmentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	
}
