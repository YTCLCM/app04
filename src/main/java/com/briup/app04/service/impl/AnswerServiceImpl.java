package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.Answer;
import com.briup.app04.dao.AnswerMapper;
import com.briup.app04.service.IAnswerService;

@Service
public class AnswerServiceImpl implements IAnswerService {
	@Autowired
	private AnswerMapper answerMapper;
	
	@Override
	public List<Answer> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<Answer> list=answerMapper.findAll();
		if(null!=list){
			return list;
		}else{
			throw new Exception("信息表为空");
		}
		
	}

	@Override
	public Answer findById(long id) throws Exception {	
		Answer course = answerMapper.findById(id);
		if(null!=course){
			return course;
		}else{
			throw new Exception("信息ID不存在");
		}
	}

	@Override
	public void update(Answer course) throws Exception {
		Answer course2 = answerMapper.findById(course.getId());
		if(null!=course2){
			answerMapper.update(course);
		}else{
			throw new Exception("信息ID不存在");
		}		
	}

	@Override
	public void delete(long id) throws Exception {
		Answer course2 = answerMapper.findById(id);
		if(null!=course2){
			answerMapper.delete(id);
		}else{
			throw new Exception("信息不存在");
		}			
	}

	@Override
	public void inserts(List<Answer> course) throws Exception {
		
		answerMapper.insert(course.get(0));
	}

	@Override
	public void insert(Answer course) throws Exception {
		Answer course2=answerMapper.findById(course.getId());
		if(null==course2){
			answerMapper.insert(course);
		}else{
			throw new Exception("信息ID已占用");
		}	
	}

}
