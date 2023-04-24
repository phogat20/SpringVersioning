package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	@GetMapping("/test")
	private String test() {
		return "hello";
	}
	
	@GetMapping("/test01")
	private String test01() {
		return "hello 01";
	}
	
	@GetMapping("/test02")
	private String test02() {
		return "hello 02";
	}
	
	@GetMapping("/test03")
	private String test03() {
		return "hello 03";
	}
}
