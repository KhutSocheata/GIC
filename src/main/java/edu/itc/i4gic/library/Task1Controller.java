package edu.itc.i4gic.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Task1Controller {
	@GetMapping("/tp14/task1")
	public String index() {
		return "task1";
	}	
}
