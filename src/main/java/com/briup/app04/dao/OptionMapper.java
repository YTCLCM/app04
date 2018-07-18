package com.briup.app04.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.briup.app04.bean.Option;

public interface OptionMapper {
	List<Option> findAll(); 
	
	Option findById(long id);
	
	void update(Option option);
	
	void inserts(@Param("option")List<Option> option);
	
	void insert(Option option);
	
	void delete(long id);
}
