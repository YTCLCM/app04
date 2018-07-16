package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.School;

public interface ISchoolService {
	List<School> findAll() throws Exception;
	
	School findById(long id) throws Exception;
	
	void update(School school) throws Exception;
	
	void delete(long id) throws Exception;
	
	void inserts(List<School> school) throws Exception;
	
	void insert(School school) throws Exception;
}
