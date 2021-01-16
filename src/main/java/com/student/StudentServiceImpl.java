package com.student;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository repo;

	/*@Override
	public List<StudentDto> getAll() {
		return repo.findAll();
	}*/

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
	return repo.save(dto);
		
	}
	
	

	
}
