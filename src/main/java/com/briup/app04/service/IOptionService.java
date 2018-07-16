package com.briup.app04.service;

import java.util.List;

import com.briup.app04.bean.Option;

public interface IOptionService {
	List<Option> findAll() throws Exception;
	
	Option findById(long id) throws Exception;
	
	void update(Option option) throws Exception;
	
	void delete(long id) throws Exception;
	
	void inserts(List<Option> option) throws Exception;
	
	void insert(Option option) throws Exception;
}
