package com.briup.app04.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.briup.app04.bean.Question;

public interface QuestionMapper {
	List<Question> findAll(); 
	
	Question findById(long id);
	
	List<Question> getQuestions(long id);
	
	void update(Question question);
	
	void inserts(@Param("question")List<Question> question);
	
	void insert(Question question);
	
	void delete(long id);

}
