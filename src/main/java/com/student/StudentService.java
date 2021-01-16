package com.student;


import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public interface StudentService  { 
	
	
	public StudentDto saveEntity(StudentDto dto);
	
	public List<Student> getAll();
	
	public Optional<Student> getById(int id);
	
	public int deleteById(int id);
	
	 public int updateById(StudentDto dto,int id);
	 
	 
	 
	 
		 
	}	

		

		


	

