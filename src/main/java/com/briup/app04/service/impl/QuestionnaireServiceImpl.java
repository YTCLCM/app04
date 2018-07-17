package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.Questionnaire;
import com.briup.app04.dao.QuestionnaireMapper;
import com.briup.app04.dao.extend.QuestionnaireVMMapper;
import com.briup.app04.service.IQuestionnaireService;
import com.briup.app04.vm.QuestionnaireVM;

@Service
public class QuestionnaireServiceImpl implements IQuestionnaireService{

	@Autowired
	private QuestionnaireMapper questionnaireMapper;
	
	@Autowired
	private QuestionnaireVMMapper questionnaireVMMapper;
	
	@Override
	public List<Questionnaire> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<Questionnaire> list=questionnaireMapper.findAll();
		if(null!=list){
			return list;
		}else{
			throw new Exception("信息表为空");
		}
		
	}

	@Override
	public Questionnaire findById(long id) throws Exception {	
		Questionnaire course = questionnaireMapper.findById(id);
		if(null!=course){
			return course;
		}else{
			throw new Exception("信息ID不存在");
		}
	}

	@Override
	public void update(Questionnaire course) throws Exception {
		Questionnaire course2 = questionnaireMapper.findById(course.getId());
		if(null!=course2){
			questionnaireMapper.update(course);
		}else{
			throw new Exception("信息ID不存在");
		}		
	}

	@Override
	public void delete(long id) throws Exception {
		Questionnaire course2 = questionnaireMapper.findById(id);
		if(null!=course2){
			questionnaireMapper.delete(id);
		}else{
			throw new Exception("信息不存在");
		}			
	}

	@Override
	public void inserts(List<Questionnaire> course) throws Exception {
		
		questionnaireMapper.insert(course.get(0));
	}

	@Override
	public void insert(Questionnaire course) throws Exception {
		Questionnaire course2=questionnaireMapper.findById(course.getId());
		if(null==course2){
			questionnaireMapper.insert(course);
		}else{
			throw new Exception("信息ID已占用");
		}	
	}

	@Override
	public List<QuestionnaireVM> findAllQuestionnaireVM() throws Exception {
		// TODO Auto-generated method stub
		return questionnaireVMMapper.findAllQuestionnaireVM();
	}
}
