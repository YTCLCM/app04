package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Grade;

public interface IGradeService {
	List<Grade> findAll() throws Exception;
	
	Grade findById(long id) throws Exception;
	
	void update(Grade grade) throws Exception;
	
	void delete(long id) throws Exception;
	
	void inserts(List<Grade> grade) throws Exception;
	
	void insert(Grade grade) throws Exception;
}
