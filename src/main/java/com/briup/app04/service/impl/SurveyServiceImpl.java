package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.Survey;
import com.briup.app04.dao.SurveyMapper;
import com.briup.app04.dao.extend.SurveyVMMapper;
import com.briup.app04.service.ISurveyService;
import com.briup.app04.vm.SurveyVM;

@Service
public class SurveyServiceImpl implements ISurveyService {

	@Autowired
	private SurveyMapper surveyMapper;
	
	@Autowired
	private SurveyVMMapper surveyVMMapper;
	
	@Override
	public List<Survey> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<Survey> list=surveyMapper.findAll();
		if(null!=list){
			return list;
		}else{
			throw new Exception("信息表为空");
		}
		
	}

	@Override
	public Survey findById(long id) throws Exception {	
		Survey course = surveyMapper.findById(id);
		if(null!=course){
			return course;
		}else{
			throw new Exception("信息ID不存在");
		}
	}

	@Override
	public void update(Survey course) throws Exception {
		Survey course2 = surveyMapper.findById(course.getId());
		if(null!=course2){
			surveyMapper.update(course);
		}else{
			throw new Exception("信息ID不存在");
		}		
	}

	@Override
	public void delete(long id) throws Exception {
		Survey course2 = surveyMapper.findById(id);
		if(null!=course2){
			surveyMapper.delete(id);
		}else{
			throw new Exception("信息不存在");
		}			
	}

	@Override
	public void inserts(List<Survey> course) throws Exception {
		
		surveyMapper.inserts(course);
	}

	@Override
	public void insert(Survey course) throws Exception {
		Survey course2=surveyMapper.findById(course.getId());
		if(null==course2){
			surveyMapper.insert(course);
		}else{
			throw new Exception("信息ID已占用");
		}	
	}

	@Override
	public List<SurveyVM> findAllSurveyVM() {
		List<SurveyVM> list=surveyVMMapper.findAll();
		return list;
	}
}
