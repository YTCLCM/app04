package com.briup.app04.vm;

import java.util.List;

import com.briup.app04.bean.Option;
/**
 * 用于存放课调的问题及其问题的选项
 * @author xiaoming
 *
 */
public class QuestionVM {
	
	private long id;
	
	private String name;
	
	private String questiontype;
	/**
	 * 用于存放问题的选项
	 */
	private List<Option> options;

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

	public String getQuestiontype() {
		return questiontype;
	}

	public void setQuestiontype(String questiontype) {
		this.questiontype = questiontype;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}
	
	
}
