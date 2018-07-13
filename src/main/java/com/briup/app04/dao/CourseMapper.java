package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Course;

public interface CourseMapper {
	
	List<Course> findAll(); 
	
	Course findById(long id);
	
	void update(Course course);
	
	void inserts(List<Course> course);
	
	void insert(Course course);
	
	void delete(long id);
}
