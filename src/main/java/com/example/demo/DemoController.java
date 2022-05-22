package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
        
	@GetMapping("/")
	public String m1() {
		return "hello venkat ramana ";
	}
}
