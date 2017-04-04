package com.myjava.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myjava.entity.User;
import com.myjava.service.UserService;

@Controller
@RequestMapping("/hello")
public class HelloController {
	@Resource
	private UserService userService ;
	@RequestMapping("/sayHello")
	public String sayHello(){
		User user = new User() ;
		user.setUsername("lxf");
		user.setPassword("123456");
		@SuppressWarnings("unused")
		List<User> users = (List<User>) userService.findAll() ;
		user = userService.getById(2L) ;
		System.out.println("Hello world");
		System.out.println("Leufay!");
		return "hello" ;
	}
}
