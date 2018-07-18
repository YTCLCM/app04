package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.School;
import com.briup.app04.dao.SchoolMapper;
import com.briup.app04.service.ISchoolService;

@Service
public class SchoolServiceImpl implements ISchoolService {

	@Autowired
	private SchoolMapper schoolMapper;
	
	@Override
	public List<School> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<School> list=schoolMapper.findAll();
		if(null!=list){
			return list;
		}else{
			throw new Exception("信息表为空");
		}
		
	}

	@Override
	public School findById(long id) throws Exception {	
		School school = schoolMapper.findById(id);
		if(null!=school){
			return school;
		}else{
			throw new Exception("信息ID不存在");
		}
	}

	@Override
	public void update(School school) throws Exception {
		School school2 = schoolMapper.findById(school.getId());
		if(null!=school2){
			schoolMapper.update(school2);
		}else{
			throw new Exception("信息ID不存在");
		}		
	}

	@Override
	public void delete(long id) throws Exception {
		School school = schoolMapper.findById(id);
		if(null!=school){
			schoolMapper.delete(id);
		}else{
			throw new Exception("信息不存在");
		}			
	}

	@Override
	public void inserts(List<School> school) throws Exception {
		
		schoolMapper.inserts(school);
	}

	@Override
	public void insert(School school) throws Exception {
		School school2=schoolMapper.findById(school.getId());
		if(null==school2){
			schoolMapper.insert(school);
		}else{
			throw new Exception("信息ID已占用");
		}	
	}

}
