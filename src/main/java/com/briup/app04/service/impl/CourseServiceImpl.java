package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.Course;
import com.briup.app04.dao.CourseMapper;
import com.briup.app04.service.ICourseService;

@Service
public class CourseServiceImpl implements ICourseService {
	@Autowired
	private CourseMapper courseMapper;
	
	@Override
	public List<Course> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<Course> list=courseMapper.findAll();
		if(null!=list){
			return list;
		}else{
			throw new Exception("信息表为空");
		}
		
	}

	@Override
	public Course findById(long id) throws Exception {	
		Course course = courseMapper.findById(id);
		if(null!=course){
			return course;
		}else{
			throw new Exception("信息ID不存在");
		}
	}

	@Override
	public void update(Course course) throws Exception {
		Course course2 = courseMapper.findById(course.getId());
		if(null!=course2){
			courseMapper.update(course);
		}else{
			throw new Exception("信息ID不存在");
		}		
	}

	@Override
	public void delete(long id) throws Exception {
		Course course2 = courseMapper.findById(id);
		if(null!=course2){
			courseMapper.delete(id);
		}else{
			throw new Exception("信息不存在");
		}			
	}

	@Override
	public void inserts(List<Course> course) throws Exception {
		
		courseMapper.inserts(course);
	}

	@Override
	public void insert(Course course) throws Exception {
		Course course2=courseMapper.findById(course.getId());
		if(null==course2){
			courseMapper.insert(course);
		}else{
			throw new Exception("信息ID已占用");
		}	
	}
}
