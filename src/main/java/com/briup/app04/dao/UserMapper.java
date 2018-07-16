package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.User;

public interface UserMapper {
	List<User> findAll(); 
	
	User findById(long id);
	
	void update(User user);
	
	void inserts(List<User> user);
	
	void insert(User user);
	
	void delete(long id);
}