package com.briup.app04.dao;

import java.util.List;

import com.briup.app04.bean.Answer;

public interface AnswerMapper {
	List<Answer> findAll(); 
	
	Answer findById(long id);
	
	void update(Answer answer);
	
	void inserts(List<Answer> answer);
	
	void insert(Answer answer);
	
	void delete(long id);
}
