package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.School;

public interface SchoolMapper {
	List<School> findAll();

	School findById(long id);

	void update(School school);

	void inserts(List<School> school);

	void insert(School school);

	void delete(long id);
}
