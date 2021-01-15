package com.student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentConverter {
	
	public StudentDto entityToDto(Student student) {
		StudentDto dto = new StudentDto();
		dto.setId(student.getId());
		dto.setName(student.getName());
		dto.setModules(student.getModules());
		
		return dto;
	}
	
	public List<StudentDto>entityToDto(List<Student>student){
		return student.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
	}
	
	public Student dtoToEntity(StudentDto dto) {
		Student student = new Student();
		student.setId(dto.getId());
		student.setName(dto.getName());
		student.setModules(dto.getModules());
		
		return student;
	}
	public List<Student>dtoToEntity(List<StudentDto>dto){
		return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}
	

	

}
