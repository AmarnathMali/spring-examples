package com.web.dao;

import java.util.List;

import com.web.model.User;

public interface UserDao {

	void save(User user);
	   List<User> list();
	

}
