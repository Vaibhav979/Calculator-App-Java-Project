package com.company.dao;

public interface UserDao {
	User isValidUser(String username, String password);

	boolean addUser(User user);	
}
