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
			 List<Student> DB = new ArrayList<>();
			  DB.add(conv.dtoToEntity(dto));
			return (StudentDto) DB;
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

		


	

