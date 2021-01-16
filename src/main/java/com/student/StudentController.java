package com.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	 
	 @Autowired
	 StudentService serv;
		
	
	 @PostMapping
	 public void saveEntity(@RequestBody StudentDto dto) {
		serv.saveEntity(dto);
	 }
	 
	@GetMapping
	 public List<Student> getAll() {
		return serv.getAll();
	 }
	 
	 @GetMapping(path ="{id}")
	 public Optional<Student> getById(@PathVariable ("id") int id){
		 return serv.getById(id);
	 }
	 @PutMapping(path ="{id}")
	 public void updateById(@RequestBody StudentDto dto,@PathVariable ("id") int id) {
		 serv.updateById(dto, id);
	 }
	 @DeleteMapping(path ="{id}")
			 public void deleteById(@PathVariable ("id") int id){
				 serv.deleteById(id);
			 }
}
