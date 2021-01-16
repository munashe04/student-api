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
	
	
	public static final StudentConverter conv = new StudentConverter();
	 List<Student> DB = new ArrayList<>();
	
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
	public Student deleteById(int id) {
		 repo.deleteById(id);
		 return repo.getOne(id);
	}
	@Override
	public int updateById(Student student1,int id) {
		if(repo.findById(id) != null) {
			 repo.save(student1);
		}
		return 1;
	
}

	@Override
	public StudentDto saveEntity(StudentDto dto) {
		Student student = new Student();
		Date today = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 
		student.setModules(dto.getModules());
		student.setId(dto.getId());
		student.setName(dto.getName());
		student.setDateCreated((dateFormat.format(today)));
		 
	 repo.save(student);
	 return dto;
		
	}
	
	

	
}
