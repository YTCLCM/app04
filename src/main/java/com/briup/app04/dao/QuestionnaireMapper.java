package com.briup.app04.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.briup.app04.bean.Questionnaire;

public interface QuestionnaireMapper {
	List<Questionnaire> findAll(); 
	
	Questionnaire findById(long id);
	
	void update(Questionnaire questionnaire);
	
	void inserts(@Param("questionnaire")List<Questionnaire> questionnaire);
	
	void insert(Questionnaire questionnaire);
	
	void delete(long id);
}
