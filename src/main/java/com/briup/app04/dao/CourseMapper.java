package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Course2;

public interface CourseMapper {
	
	List<Course2> findAll(); 
	
	Course2 findById(long id);
	
	void update(Course2 course);
	
	void inserts(List<Course2> course);
	
	void insert(Course2 course);
	
	void delete(long id);
}
