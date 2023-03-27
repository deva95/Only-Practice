package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welocomemsg {

	@GetMapping("/users/{name}/{age}/{location}")
	public String getMessgage(@PathVariable String name,
			@PathVariable Long age,@PathVariable String location) {
		
		return "Hello my name is"+name+"My age is"+age+"Currently i am living in "+location;
	}
}
