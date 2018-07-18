package com.briup.app04.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.briup.app04.bean.User;

public interface UserMapper {
	List<User> findAll(); 
	
	User findById(long id);
	
	User findByName(String name);
	
	void update(User user);
	
	void inserts(@Param("user")List<User> user);
	
	void insert(User user);
	
	void delete(long id);
}
