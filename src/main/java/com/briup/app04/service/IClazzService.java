package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Clazz;

public interface IClazzService {
	List<Clazz> findAll() throws Exception;
	
	Clazz findById(long id) throws Exception;
	
	void update(Clazz clazz) throws Exception;
	
	void delete(long id) throws Exception;
	
	void inserts(List<Clazz> clazz) throws Exception;
	
	void insert(Clazz clazz) throws Exception;
}
