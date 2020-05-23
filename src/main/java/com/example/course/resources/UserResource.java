package com.example.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;
import com.example.course.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.GET, path="/list")
	//@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9999-9999", "123456");
		return ResponseEntity.ok().body(u);
	}
	
	@GetMapping(value="/lista")
	public ResponseEntity<List<User>> listarTodos(){
		List<User> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User user = userService.findById(id);
		return ResponseEntity.ok().body(user);
	}

}
