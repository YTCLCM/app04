package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.Grade;
import com.briup.app04.dao.GradeMapper;
import com.briup.app04.service.IGradeService;

@Service
public class GradeServiceImpl implements IGradeService{
	@Autowired
	private GradeMapper gradeMapper;
	
	@Override
	public List<Grade> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<Grade> list=gradeMapper.findAll();
		if(null!=list){
			return list;
		}else{
			throw new Exception("信息表为空");
		}
		
	}

	@Override
	public Grade findById(long id) throws Exception {	
		Grade course = gradeMapper.findById(id);
		if(null!=course){
			return course;
		}else{
			throw new Exception("信息ID不存在");
		}
	}

	@Override
	public void update(Grade course) throws Exception {
		Grade course2 = gradeMapper.findById(course.getId());
		if(null!=course2){
			gradeMapper.update(course);
		}else{
			throw new Exception("信息ID不存在");
		}		
	}

	@Override
	public void delete(long id) throws Exception {
		Grade course2 = gradeMapper.findById(id);
		if(null!=course2){
			gradeMapper.delete(id);
		}else{
			throw new Exception("信息不存在");
		}			
	}

	@Override
	public void inserts(List<Grade> course) throws Exception {
		
		gradeMapper.insert(course.get(0));
	}

	@Override
	public void insert(Grade course) throws Exception {
		Grade course2=gradeMapper.findById(course.getId());
		if(null==course2){
			gradeMapper.insert(course);
		}else{
			throw new Exception("信息ID已占用");
		}	
	}

	@Override
	public Grade findByName(String name) throws Exception {
		Grade grade=gradeMapper.findByName(name);
		return grade;
	}

}
