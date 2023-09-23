package com.dock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Docker {
	
	@GetMapping(value="/getValue")
	public String getValue() {
		return "This value is 13";
	}

}
