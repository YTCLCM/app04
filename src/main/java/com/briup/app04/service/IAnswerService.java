package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Answer;

public interface IAnswerService {
	List<Answer> findAll() throws Exception;
	
	Answer findById(long id) throws Exception;
	
	void update(Answer answer) throws Exception;
	
	void delete(long id) throws Exception;
	
	void inserts(List<Answer> answer) throws Exception;
	
	void insert(Answer answer) throws Exception;
}
