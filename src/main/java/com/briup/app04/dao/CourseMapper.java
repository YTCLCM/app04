package com.briup.app04.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.briup.app04.bean.Course;

public interface CourseMapper {
	List<Course> findAll(); 
	
	Course findById(long id);
	
	void update(Course course);
	
	void inserts(@Param("course")List<Course> course);
	
	void insert(Course course);
	
	void delete(long id);
}
