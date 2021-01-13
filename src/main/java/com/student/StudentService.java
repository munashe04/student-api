package com.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface StudentService  {
	
	 List<Student> DB = new ArrayList<>();
	
		public default void saveEntity(Student student) {
			 DB.add(student);
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

		


	

