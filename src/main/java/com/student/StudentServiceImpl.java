package com.student;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
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
	public List<StudentDto> getAll() {
		List<Student> students =  repo.findAll();
		System.out.println("get all");
		return conv.entityToDto1(students);
		
	}

	@Override
	public StudentDto getById(int id) {
		
	Optional<Student> student =  repo.findById(id);
	if(student.isPresent()) {
		
		return conv.entityToDto(student.get());
	}else {
		
	}
	return conv.entityToDto(student.get());
	}
	@Override
	public StudentDto deleteById(int id) {
		
		Optional<Student> student =  repo.findById(id);
		if(student.isPresent()) {
			
			repo.deleteById(id);
		}
		 return null;
	}
	@Override
	public StudentDto updateById(StudentDto dto1,int id) {
		
		Optional<Student> studentt = repo.findById(id);
		if( studentt.isPresent()) {
			//DB.remove(conv.entityToDto(studentt.get()));
			//repo.delete(studentt.get());
			repo.save(conv.dtoToEntity(dto1));
		   System.out.println(" repo.save(conv.dtoToEntity(dto1))");
		}
		//repo.save(conv.dtoToEntity(dto1));
		return dto1;
}
	/*@Override
	public StudentDto updateById(StudentDto dto1,int id) {
		 List<StudentDto> DB = new ArrayList<>();
		return findById(dto -> {
			int toBeUpdated = DB.indexOf(dto);
			if(toBeUpdated >= 0) {
				DB.set(toBeUpdated,new StudentDto(dto1.getName()));
				
				return 1;
		}) ;
		return 0;
		}
		
		
	}*/
	@Override
	public StudentDto saveEntity(int id,StudentDto dto) {
		repo.save(conv.dtoToEntity(dto));
	 return dto;
	}
	
}	