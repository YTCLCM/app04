package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.Option;
import com.briup.app04.bean.Question;
import com.briup.app04.dao.OptionMapper;
import com.briup.app04.dao.QuestionMapper;
import com.briup.app04.service.IOptionService;

@Service
public class OptionServiceImpl implements IOptionService{

	@Autowired
	private OptionMapper optionMapper;
	@Autowired
	private QuestionMapper questionMapper;
	
	@Override
	public List<Option> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<Option> list=optionMapper.findAll();
		if(null!=list){
			return list;
		}else{
			throw new Exception("信息表为空");
		}
		
	}

	@Override
	public Option findById(long id) throws Exception {	
		Option course = optionMapper.findById(id);
		if(null!=course){
			return course;
		}else{
			throw new Exception("信息ID不存在");
		}
	}

	@Override
	public void update(Option course) throws Exception {
		Option course2 = optionMapper.findById(course.getId());
		if(null!=course2){
			optionMapper.update(course);
		}else{
			throw new Exception("信息ID不存在");
		}		
	}

	@Override
	public void delete(long id) throws Exception {
		Option course2 = optionMapper.findById(id);
		if(null!=course2){
			optionMapper.delete(id);
		}else{
			throw new Exception("信息不存在");
		}			
	}

	@Override
	public void inserts(List<Option> course) throws Exception {
		
		optionMapper.insert(course.get(0));
	}

	@Override
	public void insert(Option option) throws Exception {
		Question question=questionMapper.findById(option.getQuestion_id());
		if(null==question){
			throw new Exception("question_id不存在");
		}
		Option course2=optionMapper.findById(option.getId());
		if(null==course2){
			optionMapper.insert(option);
		}else{
			throw new Exception("信息ID已占用");
		}	
	}
}
