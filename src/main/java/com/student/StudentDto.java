package com.student;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class StudentDto {
	
	private int id;
	private String name;
	private String modules;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModules() {
		return modules;
	}
	public void setModules(String modules) {
		this.modules = modules;
	}
	 List<Student> DB = new ArrayList<>();


}
