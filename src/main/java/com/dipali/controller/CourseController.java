package com.dipali.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {
	
	
	@GetMapping("/course")
	public String course(@RequestParam String cname,Model model) {
		String mgs="new"+cname+"start from 1 sep";
	System.out.println(mgs);
	model.addAttribute("CNAME",mgs);
		return "course";
		
	}
	
	
	@GetMapping("/courses")
	public String course(@RequestParam String cname,@RequestParam String fname,Model model) {
		String mgs="new"+cname+"start from 1 sep"+fname;
	System.out.println(mgs);
	model.addAttribute("NAMEs",mgs);
		return "courses";
		
	}

}
