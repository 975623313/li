package com.an.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.an.pojo.Mess;
import com.an.pojo.User;
import com.an.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/save")
	@ResponseBody
	public String findAll(Mess mess){
		
		System.out.println("11111111111111111111111");
		System.out.println(mess);
			try {
				this.userService.saveMessService(mess);
			} catch (Exception e) {
				return "400";
			}
		
		
		
		return "200";
	}

}
