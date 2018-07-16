package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Question;

public interface IQuestionService {
	List<Question> findAll() throws Exception;
	
	Question findById(long id) throws Exception;
	
	void update(Question question) throws Exception;
	
	void delete(long id) throws Exception;
	
	void inserts(List<Question> question) throws Exception;
	
	void insert(Question question) throws Exception;
}
