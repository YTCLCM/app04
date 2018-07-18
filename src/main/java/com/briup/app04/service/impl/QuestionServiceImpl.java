package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.Option;
import com.briup.app04.bean.Question;
import com.briup.app04.dao.OptionMapper;
import com.briup.app04.dao.QuestionMapper;
import com.briup.app04.dao.extend.QuestionVMMapper;
import com.briup.app04.service.IQuestionService;
import com.briup.app04.vm.QuestionVM;

@Service
public class QuestionServiceImpl implements IQuestionService {

	@Autowired
	private QuestionMapper questionMapper;
	
	@Autowired
	private QuestionVMMapper questionVMMapper;
	
	@Autowired
	private OptionMapper optionMapper;
	
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
		
		questionMapper.inserts(course);
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

	@Override
	public List<QuestionVM> findAllQuestionVM() throws Exception {
		
		return questionVMMapper.findAllQuestionVM();
	}

	@Override
	public void insertQuestionAndOption(Question question,List<Option> options) throws Exception {
		/**
		 * 将question和option从questionVM中剥离出来、
		 * question  List<Option>
		 * QuestionMaper.insert(question)
		 * 获取刚刚question的ID
		 * 
		 */
		/*Question question=new Question();
		question.setId(questionVM.getId());
		question.setName(questionVM.getName());
		question.setQuestiontype(questionVM.getQuestiontype());
		List<Option> options=questionVM.getOptions();*/
		//保存问题
		questionMapper.insert(question);
		//获取刚刚获取的id
		Long question_id=question.getId();
		//保存选项
		for(Option option:options){
			//保存option的外键
			option.setQuestion_id(question_id);
			optionMapper.insert(option);
		}
	}

}
