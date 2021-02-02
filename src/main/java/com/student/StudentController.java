package com.student;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
	 public void saveEntity(@RequestBody int id,StudentDto dto) {
		serv.saveEntity(id,dto);
	 }
	 
	@GetMapping
	 public List<StudentDto> getAll() {
		return serv.getAll();
	 }
	 
	 @GetMapping(path ="{id}")
	 public StudentDto getById(@PathVariable ("id") int id){
		 return serv.getById(id);
	 }
	 @PutMapping(path ="{id}")
	 public StudentDto updateById(@RequestBody StudentDto dto,@PathVariable ("id") int id) {
		 System.out.println("Controller");
		return serv.updateById(dto, id);
	 }
	 @DeleteMapping(path ="{id}")
			 public StudentDto deleteById(@PathVariable ("id") int id){
				return serv.deleteById(id);
			 }
}
