package com.student;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;


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


}
