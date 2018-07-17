package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Survey;
import com.briup.app04.vm.SurveyVM;

public interface ISurveyService {
	List<Survey> findAll() throws Exception;
	
	List<SurveyVM> findAllSurveyVM(); 
	
	Survey findById(long id) throws Exception;
	
	void update(Survey survey) throws Exception;
	
	void delete(long id) throws Exception;
	
	void inserts(List<Survey> survey) throws Exception;
	
	void insert(Survey survey) throws Exception;
}
