package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Grade;

public interface GradeMapper {
	List<Grade> findAll(); 
	
	Grade findById(long id);
	
	void update(Grade grade);
	
	void inserts(List<Grade> grade);
	
	void insert(Grade grade);
	
	void delete(long id);
}
