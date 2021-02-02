package com.student;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class StudentConverter {
	
	public StudentDto entityToDto(Student student) {
		StudentDto dto = new StudentDto();
		dto.setId(student.getId());
		dto.setName(student.getName());
		dto.setModules(student.getModules());
	
		return dto;
	}
	
	public List<StudentDto>entityToDto1(List<Student>student){
		return student.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
	}
	
	public Student dtoToEntity(StudentDto dto) {
		Student student = new Student();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date today = new Date();
	
		student.setId(dto.getId());
		student.setName(dto.getName());
		student.setModules(dto.getModules());
		student.setDateCreated(dateFormat.format(today));
		
		return student;
	}
	public List<Student>dtoToEntity(List<StudentDto>dto){
		return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}

	/*public Optional<StudentDto> entityToDto1(Optional<Student> studen) {
		
		studen.stream().filter(dto -> dto.getId()== id).findFirst());
		return studen.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
	}*/
		
	}


	
	

	


