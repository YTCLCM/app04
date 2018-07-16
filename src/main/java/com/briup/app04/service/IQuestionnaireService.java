package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Questionnaire;

public interface IQuestionnaireService {
	List<Questionnaire> findAll() throws Exception;
	
	Questionnaire findById(long id) throws Exception;
	
	void update(Questionnaire questionnaire) throws Exception;
	
	void delete(long id) throws Exception;
	
	void inserts(List<Questionnaire> questionnaire) throws Exception;
	
	void insert(Questionnaire questionnaire) throws Exception;
}
