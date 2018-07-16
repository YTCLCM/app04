package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.QQ;

public interface IQQService {
	List<QQ> findAll() throws Exception;
	
	QQ findById(long id) throws Exception;
	
	void update(QQ qq) throws Exception;
	
	void delete(long id) throws Exception;
	
	void inserts(List<QQ> qq) throws Exception;
	
	void insert(QQ qq) throws Exception;
}
