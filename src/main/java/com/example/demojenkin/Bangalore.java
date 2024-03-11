package com.example.demojenkin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Bangalore {
	
	@GetMapping("/home2")
	public String Home2() {
		
		return "bangalore";
	}

}
