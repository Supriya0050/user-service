package com.example.userservice.dto;

public class ResponseDto {
    private DepartmentDto department;
    private UserDto user;
    
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
    
    
}
