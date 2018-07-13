package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Student;

public interface IStudentService {
	
	List<Student> findAll() throws Exception;
	
	Student findById(long id) throws Exception;
	
	void update(Student student) throws Exception;
	
	void delete(long id) throws Exception;
	
	void insert(Student student) throws Exception;
}
