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
import org.springframework.stereotype.Service;


@Service
public interface StudentService  {
	
	public static final StudentConverter conv = new StudentConverter();
	 List<Student> DB = new ArrayList<>();
	 
	 
		public default StudentDto saveEntity(StudentDto dto) {
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date today = new Date();
		
		
			System.out.println(dateFormat.format(today));
			Student student = new Student();
			student.setId(dto.getId());
			student.setName(dto.getName());
			student.setModules(dto.getModules());
			student.setDateCreated((dateFormat.format(today)));
			
			 List<Student> DB = new ArrayList<>();
			
			DB.add(student);
			
			return (StudentDto) DB.stream().map(conv::entityToDto).collect(Collectors.toList());
		}
			 
	
	default List<Student> getAll(){
		 return DB;
	 }
	
	public Optional<Student> getById(int id);
	
	
	default Student deleteById(int id) {
		return (Student) DB;
	}
	
	 default int updateById(Student student1,int id) {
		 return 1;
		 
	}	

		}

		


	

