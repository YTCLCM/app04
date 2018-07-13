package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Student;

public interface StudentMapper {
	List<Student> findAll(); 
	
	Student findById(long id);
	
	void update(Student student);
	
	void insert(Student student);
	
	void inserts(Student student);
	
	void delete(long id);
}
