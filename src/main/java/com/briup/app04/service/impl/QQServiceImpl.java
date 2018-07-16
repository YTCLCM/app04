package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.QQ;
import com.briup.app04.dao.QQMapper;
import com.briup.app04.service.IQQService;

@Service
public class QQServiceImpl implements IQQService {

	@Autowired
	private QQMapper qqMapper;
	
	@Override
	public List<QQ> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<QQ> list=qqMapper.findAll();
		if(null!=list){
			return list;
		}else{
			throw new Exception("信息表为空");
		}
		
	}

	@Override
	public QQ findById(long id) throws Exception {	
		QQ course = qqMapper.findById(id);
		if(null!=course){
			return course;
		}else{
			throw new Exception("信息ID不存在");
		}
	}

	@Override
	public void update(QQ course) throws Exception {
		QQ course2 = qqMapper.findById(course.getId());
		if(null!=course2){
			qqMapper.update(course);
		}else{
			throw new Exception("信息ID不存在");
		}		
	}

	@Override
	public void delete(long id) throws Exception {
		QQ course2 = qqMapper.findById(id);
		if(null!=course2){
			qqMapper.delete(id);
		}else{
			throw new Exception("信息不存在");
		}			
	}

	@Override
	public void inserts(List<QQ> course) throws Exception {
		
		qqMapper.insert(course.get(0));
	}

	@Override
	public void insert(QQ course) throws Exception {
		QQ course2=qqMapper.findById(course.getId());
		if(null==course2){
			qqMapper.insert(course);
		}else{
			throw new Exception("信息ID已占用");
		}	
	}
}
