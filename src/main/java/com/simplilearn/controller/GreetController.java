package com.simplilearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {

	// STEP 1: Handle Request
	@GetMapping("/greet")
	public String greet(Model model, @RequestParam(name = "firstName") String firstName,
			@RequestParam(name = "lastName") String lastName) {
		// STEP 2: Implement business logic

		// STEP 3: Populate model
		model.addAttribute("name", firstName + " " + lastName);

		// STEP 4: Invoke view
		return "hello";
	}
}
