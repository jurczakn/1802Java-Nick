package com.revature.service;

import com.revature.dao.UserDAO;
import com.revature.dao.UserDaoImpl;
import com.revature.domain.User;

public class UserService {
	
	UserDAO userDao = new UserDaoImpl();
	
	public User addUser(User user) {
		return userDao.addUser(user);
	}

}
