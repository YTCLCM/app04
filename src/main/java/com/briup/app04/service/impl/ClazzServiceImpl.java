package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.Clazz;
import com.briup.app04.dao.ClazzMapper;
import com.briup.app04.service.IClazzService;
@Service
public class ClazzServiceImpl implements IClazzService {
	@Autowired
	private ClazzMapper clazzMapper;
	
	@Override
	public List<Clazz> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<Clazz> list=clazzMapper.findAll();
		if(null!=list){
			return list;
		}else{
			throw new Exception("信息表为空");
		}
		
	}

	@Override
	public Clazz findById(long id) throws Exception {	
		Clazz course = clazzMapper.findById(id);
		if(null!=course){
			return course;
		}else{
			throw new Exception("信息ID不存在");
		}
	}

	@Override
	public void update(Clazz course) throws Exception {
		Clazz course2 = clazzMapper.findById(course.getId());
		if(null!=course2){
			clazzMapper.update(course);
		}else{
			throw new Exception("信息ID不存在");
		}		
	}

	@Override
	public void delete(long id) throws Exception {
		Clazz course2 = clazzMapper.findById(id);
		if(null!=course2){
			clazzMapper.delete(id);
		}else{
			throw new Exception("信息不存在");
		}			
	}

	@Override
	public void inserts(List<Clazz> course) throws Exception {
		
		clazzMapper.insert(course.get(0));
	}

	@Override
	public void insert(Clazz course) throws Exception {
		Clazz course2=clazzMapper.findById(course.getId());
		if(null==course2){
			clazzMapper.insert(course);
		}else{
			throw new Exception("信息ID已占用");
		}	
	}
}
