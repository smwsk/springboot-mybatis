package com.smu.hydm.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.smu.hydm.dao.UserDao;
import com.smu.hydm.entity.User;
import com.smu.hydm.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	public UserDao userDao;
	
	@Override
	public List<User> getUsers() {
		List<User> users = userDao.getUsers();
		return users==null?new ArrayList<User>():users;
	}
	
}
