package com.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.Customer;
import com.customer.CustomerDto;

@Service
public interface StudentService  {
	
	@Autowired
	StudentConverter conv;

	 List<Student> DB = new ArrayList<>();
	
	 
		public default StudentDto saveEntity(StudentDto dto) {
			
			Student student = new Student();
			DB.add(student);
			
			return (StudentDto) DB.stream().map(conv::entityToDto).collect(Collectors.toList());
		}
			 
		}
	
	 default List<StudentDto> getAll(){
		 return DB;
	 }
	
	public Optional<StudentDto> getById(int id);
	
	
	default StudentDto deleteById(int id) {
		return (StudentDto) DB;
	}
	
	 default int updateById(StudentDto student1,int id) {
		 return 1;
		 
	}	

		}

		


	

