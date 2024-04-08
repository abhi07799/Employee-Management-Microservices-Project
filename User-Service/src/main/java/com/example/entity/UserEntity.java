package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "user_mail")
	private String userMail;
	
	@Column(name = "user_mobile")
	private String userMobile;
	
	@Column(name = "department_code")
	private String departmentCode;

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserEntity(String userName, String userMail, String userMobile, String departmentCode) {
		super();
		this.userName = userName;
		this.userMail = userMail;
		this.userMobile = userMobile;
		this.departmentCode = departmentCode;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	
	
	
}
