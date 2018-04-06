package com.revature.dao;

import java.util.List;

import com.revature.domain.User;


public interface UserDAO {
	
	public User addUser(User user);
	public List<User> getAllUsers();
	public User updateUser(User user);
	public User getUserById(int id);
	public User getUserByUsername(String username);
	public User addFollower(User user, User follower);

}
