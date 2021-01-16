package com.student;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentConverter conv;
	 List<StudentDto> DB = new ArrayList<>();
	
	@Autowired
	private StudentRepository repo;

	@Override
	public List<Student> getAll() {
		return repo.findAll();
		
	
	}

	@Override
	public Optional<Student> getById(int id) {
		return repo.findById(id);
		 
	}

	@Override
	public int deleteById(int id) {
		 repo.deleteById(id);
		 return 0;
		 
		 
	}
	@Override
	public int updateById(StudentDto dto,int id) {
		if(repo.findById(id) != null) {
			repo.save(conv.dtoToEntity(dto));
		}
		
		return 0;
}

	@Override
	public StudentDto saveEntity(StudentDto dto) {
		repo.save(conv.dtoToEntity(dto));
	 return dto;
		
	}
	
	

	
}
