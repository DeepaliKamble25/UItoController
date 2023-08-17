package com.dipali.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dipali.model.User;
import com.dipali.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/loadform")
	public String register() {
		
		String s="User register successfully !!!";
		return "RegForm";
		
		
	}
	@GetMapping("/saveuser")
	public String saveUser(User user,Model model) {
		System.out.println(user);
		
		User userSaved =this.userService.saveuser(user);
		String savedUser=""+userSaved.getUname() +"User register successfully !!!";
		model.addAttribute("Sum", savedUser);
		
		
		return "REGSuccess";
		
		
	}
	

}
