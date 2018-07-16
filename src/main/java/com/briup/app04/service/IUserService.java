package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.User;

public interface IUserService {
	List<User> findAll() throws Exception;
	
	User findById(long id) throws Exception;
	
	void update(User user) throws Exception;
	
	void delete(long id) throws Exception;
	
	void inserts(List<User> user) throws Exception;
	
	void insert(User user) throws Exception;
}
