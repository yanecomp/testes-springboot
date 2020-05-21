package com.example.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;

@RestController
@RequestMapping(value="/teste")
public class TesteResource {
	
	@GetMapping
	public ResponseEntity findAll() {
		
		User u = new User(1L, "Maria", "maria@gmail.com", "9999-9999", "123456");
		
		return ResponseEntity.ok().body(u);
	}


}
