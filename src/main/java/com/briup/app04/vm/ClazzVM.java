package com.briup.app04.vm;

import com.briup.app04.bean.Grade;
import com.briup.app04.bean.User;

/**
 * 用于Clazz与User,Grade的级联模型
 * @author xiaoming
 *
 */
public class ClazzVM {
	/**
	 * 班级的ID
	 */
	private long id;
	/**
	 * 班级的名称
	 */
	private String name;
	/**
	 * 对班级的描述
	 */
	private String description;
	/**
	 * 存放班级级联的年级信息
	 */
	private Grade grade;
	/**
	 * 存放班级级联班主任信息
	 */
	private User user;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
