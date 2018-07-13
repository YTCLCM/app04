package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.Student;
import com.briup.app04.dao.StudentMapper;
import com.briup.app04.service.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService{
	//自动注入
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public List<Student> findAll() throws Exception {
		//调用studentMapper查询所有学生
		List<Student> list=studentMapper.findAll();
		if(null!=list){
			return list;
		}else{
			throw new Exception("信息表为空");
		}
	}

	@Override
	public Student findById(long id) throws Exception { 
		Student student=studentMapper.findById(id);
		if(null!=student){
			return student;
		}else{
			throw new Exception("结果ID不存在");			
		}
	}

	@Override
	public void update(Student student) throws Exception{
		Student student2=studentMapper.findById(student.getId());
		if(null!=student2){
			studentMapper.update(student);
		}else{
			throw new Exception("信息ID不存在");
		}
	}

	@Override
	public void delete(long id) throws Exception{
		Student student=studentMapper.findById(id);
		if(null!=student){
			studentMapper.delete(id);
		}else{
			throw new Exception("信息ID不存在");
		}
		
	}

	@Override
	public void insert(Student student) throws Exception{
		Student student2=studentMapper.findById(student.getId());
		if(null==student2){
			studentMapper.insert(student);
		}else{
			throw new Exception("信息ID已占用");
		}
	}

}
