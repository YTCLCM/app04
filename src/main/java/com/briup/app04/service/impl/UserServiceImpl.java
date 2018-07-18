package com.briup.app04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app04.bean.User;
import com.briup.app04.dao.UserMapper;
import com.briup.app04.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<User> list=userMapper.findAll();
		if(null!=list){
			return list;
		}else{
			throw new Exception("信息表为空");
		}
		
	}

	@Override
	public User findById(long id) throws Exception {	
		User user = userMapper.findById(id);
		if(null!=user){
			return user;
		}else{
			throw new Exception("信息ID不存在");
		}
	}

	@Override
	public void update(User USER) throws Exception {
		User user2 = userMapper.findById(USER.getId());
		if(null!=user2){
			userMapper.update(USER);
		}else{
			throw new Exception("信息ID不存在");
		}		
	}

	@Override
	public void delete(long id) throws Exception {
		User user = userMapper.findById(id);
		if(null!=user){
			userMapper.delete(id);
		}else{
			throw new Exception("信息不存在");
		}			
	}

	@Override
	public void inserts(List<User> user) throws Exception {
		
		userMapper.inserts(user);
	}

	@Override
	public void insert(User user) throws Exception {
		User user2=userMapper.findById(user.getId());
		if(null==user2){
			userMapper.insert(user);
		}else{
			throw new Exception("信息ID已占用");
		}	
	}

	@Override
	public User findByName(String name) throws Exception {
		User user=userMapper.findByName(name);
		return user;
	}

}
