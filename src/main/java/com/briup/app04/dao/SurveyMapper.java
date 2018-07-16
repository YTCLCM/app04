package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Survey;

public interface SurveyMapper {
	List<Survey> findAll(); 
	
	Survey findById(long id);
	
	void update(Survey survey);
	
	void inserts(List<Survey> survey);
	
	void insert(Survey survey);
	
	void delete(long id);
}
