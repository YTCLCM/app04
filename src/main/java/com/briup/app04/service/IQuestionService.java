package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Option;
import com.briup.app04.bean.Question;
import com.briup.app04.vm.QuestionVM;

public interface IQuestionService {
	List<Question> findAll() throws Exception;
	
	Question findById(long id) throws Exception;
	
	List<QuestionVM> findAllQuestionVM() throws Exception;
	
	void update(Question question) throws Exception;
	
	void delete(long id) throws Exception;
	
	void inserts(List<Question> question) throws Exception;
	
	void insert(Question question) throws Exception;
	
	void insertQuestionAndOption(Question question,List<Option> options) throws Exception;

}
