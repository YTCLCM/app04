package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.QQ;

public interface QQMapper {
	List<QQ> findAll(); 
	
	QQ findById(long id);
	
	void update(QQ qq);
	
	void inserts(List<QQ> qq);
	
	void insert(QQ qq);
	
	void delete(long id);
}
