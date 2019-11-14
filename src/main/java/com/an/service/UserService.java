package com.an.service;

import java.util.List;

import com.an.pojo.Mess;
import com.an.pojo.User;

public interface UserService {

	List<User> findAllUser();
	void saveMessService(Mess mess);
}
