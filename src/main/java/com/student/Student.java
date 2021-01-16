package com.student;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	
	private int id;
	private String name;
	private String modules;
	private String dateCreated;
	private String status;
	
	
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String string) {
		this.dateCreated = string;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
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
	
	public Student() {};
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	
	

}
