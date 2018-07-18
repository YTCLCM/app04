package com.briup.app04.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.briup.app04.bean.Grade;

public interface GradeMapper {
	List<Grade> findAll(); 
	
	Grade findById(long id);
	
	Grade findByName(String name);
	
	void update(Grade grade);
	
	void inserts(@Param("grade")List<Grade> grade);
	
	void insert(Grade grade);
	
	void delete(long id);
}
