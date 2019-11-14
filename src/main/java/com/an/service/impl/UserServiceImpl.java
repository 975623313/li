package com.an.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.an.mapper.UserMapper;
import com.an.pojo.Mess;
import com.an.pojo.User;
import com.an.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		System.out.println("---------1111111111111");
		List<User> list = this.userMapper.findAllUser();
		for (User user : list) {
			System.out.println(user);
		}
		return list;
	}

	@Override
	public void saveMessService(Mess mess) {
		this.userMapper.saveMess(mess);
		
	}

}
