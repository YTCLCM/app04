package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.Question;
import com.briup.app04.dao.QuestionMapper;
import com.briup.app04.service.IQuestionService;
import com.briup.app04.service.IQuestionnaireService;

@Service
public class QuestionServiceImpl implements IQuestionService {

	@Autowired
	private QuestionMapper questionMapper;
	
	@Override
	public List<Question> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<Question> list=questionMapper.findAll();
		if(null!=list){
			return list;
		}else{
			throw new Exception("信息表为空");
		}
		
	}

	@Override
	public Question findById(long id) throws Exception {	
		Question question = questionMapper.findById(id);
		if(null!=question){
			return question;
		}else{
			throw new Exception("信息ID不存在");
		}
	}

	@Override
	public void update(Question course) throws Exception {
		Question question2 = questionMapper.findById(course.getId());
		if(null!=question2){
			questionMapper.update(course);
		}else{
			throw new Exception("信息ID不存在");
		}		
	}

	@Override
	public void delete(long id) throws Exception {
		Question question2 = questionMapper.findById(id);
		if(null!=question2){
			questionMapper.delete(id);
		}else{
			throw new Exception("信息不存在");
		}			
	}

	@Override
	public void inserts(List<Question> course) throws Exception {
		
		questionMapper.insert(course.get(0));
	}

	@Override
	public void insert(Question course) throws Exception {
		Question question2=questionMapper.findById(course.getId());
		if(null==question2){
			questionMapper.insert(course);
		}else{
			throw new Exception("信息ID已占用");
		}	
	}

}
