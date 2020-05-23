package com.example.course.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaginaPrincipal {
	
	@RequestMapping("/principal")
	String home() {
		return "Olá mundo!";
	}

}
