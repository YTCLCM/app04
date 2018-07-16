package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Clazz;

public interface ClazzMapper {
	List<Clazz> findAll(); 
	
	Clazz findById(long id);
	
	void update(Clazz clazz);
	
	void inserts(List<Clazz> clazz);
	
	void insert(Clazz clazz);
	
	void delete(long id);
}
