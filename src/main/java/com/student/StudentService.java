package com.student;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public interface StudentService  { 
	
	
	public StudentDto saveEntity(int id,StudentDto dto);
	
	/*default StudentDto addEntity(StudentDto dto) {
		UUID id =UUID.randomUUID();
		return saveEntity(id,dto);
	}*/
	
	public List<StudentDto> getAll();
	
	public StudentDto getById(int id);
	
	public StudentDto deleteById(int id);
	
	 public StudentDto updateById(StudentDto dto,int id);
	 
	 
	 
	 
		 
	}	

		

		


	

