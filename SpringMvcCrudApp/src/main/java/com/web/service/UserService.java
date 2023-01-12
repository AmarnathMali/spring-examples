package com.web.service;

import java.util.List;

import com.web.model.User;

public interface UserService {

	void save(User user);

	   List<User> list();

}
