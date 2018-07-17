package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Questionnaire;
import com.briup.app04.vm.QuestionnaireVM;

public interface IQuestionnaireService {
	List<Questionnaire> findAll() throws Exception;
	
	Questionnaire findById(long id) throws Exception;
	/**
	 * 根据问卷的ID获得该问卷的所有题型
	 * @return
	 * @throws Exception
	 */
	List<QuestionnaireVM> findAllQuestionnaireVM() throws Exception;
	
	void update(Questionnaire questionnaire) throws Exception;
	
	void delete(long id) throws Exception;
	
	void inserts(List<Questionnaire> questionnaire) throws Exception;
	
	void insert(Questionnaire questionnaire) throws Exception;
}
