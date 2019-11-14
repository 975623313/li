package com.an.mapper;

import java.util.List;

import com.an.pojo.Mess;
import com.an.pojo.User;

public interface UserMapper {

	List<User> findAllUser();
	void saveMess(Mess mess);
	
}
