package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Questionnaire;

public interface QuestionnaireMapper {
	List<Questionnaire> findAll(); 
	
	Questionnaire findById(long id);
	
	void update(Questionnaire questionnaire);
	
	void inserts(List<Questionnaire> questionnaire);
	
	void insert(Questionnaire questionnaire);
	
	void delete(long id);
}
