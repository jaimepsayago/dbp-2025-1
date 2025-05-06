package com.my_project.my_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//servicio web para API o integracion

@RestController
public class HelloRestController {
	@GetMapping("/hellorest")
	public String helloWorld() {
		//datos desde una bd
		//lista array
		//mensaje en json o xml 
		return "hola mundo desde una clase";
	}

}
