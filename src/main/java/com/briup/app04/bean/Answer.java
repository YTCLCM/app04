package com.briup.app04.bean;

public class Answer {
	//答卷的ID
	private long id;
	//答卷的选项
	private String selection;
	private String check;
	private String content;
	private long survey_id;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSelection() {
		return selection;
	}
	public void setSelection(String selection) {
		this.selection = selection;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public long getSurvey_id() {
		return survey_id;
	}
	public void setSurvey_id(long survey_id) {
		this.survey_id = survey_id;
	}
}
