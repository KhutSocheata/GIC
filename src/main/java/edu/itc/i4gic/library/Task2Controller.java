package edu.itc.i4gic.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Task2Controller {
	@GetMapping("/tp14/task2")
	public String index() {
		return "task2";  
	}	
}
