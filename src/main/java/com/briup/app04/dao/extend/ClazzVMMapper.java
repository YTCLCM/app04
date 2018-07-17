package com.briup.app04.dao.extend;

import java.util.List;

import com.briup.app04.vm.ClazzVM;

public interface ClazzVMMapper {
	/**
	 * 对班级级联的查询
	 * @return List<ClazzVM>
	 */
	List<ClazzVM> findAll(); 
	
	void insertClazzVM(ClazzVM clazzVM);
}
