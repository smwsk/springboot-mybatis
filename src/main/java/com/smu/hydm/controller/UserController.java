package com.smu.hydm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smu.hydm.entity.User;
import com.smu.hydm.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Resource
	public UserService userService;
	
	@RequestMapping("/getUsers")
	public List<User> getUsers() {
		return userService.getUsers();
	}
}
