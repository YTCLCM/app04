package com.briup.app04.bean;

public class Question {
	private long id;
	private String name;
	private String questiontype;
	private String questionnaire_id;
	
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
	public String getQuestionnaire_id() {
		return questionnaire_id;
	}
	public void setQuestionnaire_id(String questionnaire_id) {
		this.questionnaire_id = questionnaire_id;
	}
}
