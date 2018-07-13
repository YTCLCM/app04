package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Course;

public interface ICourseService {
	List<Course> findAll() throws Exception;
	
	Course findById(long id) throws Exception;
	
	void update(Course course) throws Exception;
	
	void delete(long id) throws Exception;
	
	void inserts(List<Course> course) throws Exception;
	
	void insert(Course course) throws Exception;
	
}
