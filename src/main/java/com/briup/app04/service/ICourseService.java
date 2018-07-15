package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Course2;

public interface ICourseService {
	List<Course2> findAll() throws Exception;
	
	Course2 findById(long id) throws Exception;
	
	void update(Course2 course) throws Exception;
	
	void delete(long id) throws Exception;
	
	void inserts(List<Course2> course) throws Exception;
	
	void insert(Course2 course) throws Exception;
	
}
