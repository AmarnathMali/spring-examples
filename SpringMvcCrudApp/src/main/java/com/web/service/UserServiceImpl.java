package com.web.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.UserDao;
import com.web.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Transactional
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
		
	}

	@Transactional
	public List<User> list() {
		// TODO Auto-generated method stub
		return userDao.list();
	}
	
	
	
}
