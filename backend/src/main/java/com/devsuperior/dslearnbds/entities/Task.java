package com.devsuperior.dslearnbds.entities;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_task")
public class Task extends Lesson {
	private static final long serialVersionUID = 1L;

	private String Description;
	private Integer questionCount;
	private Integer approvlCount;
	private Double weight;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant dueDate;
	
	public Task() {
	}

	public Task(Long id, String title, Integer position, Section section, String description, Integer questionCount,
			Integer approvlCount, Double weight, Instant dueDate) {
		super(id, title, position, section);
		Description = description;
		this.questionCount = questionCount;
		this.approvlCount = approvlCount;
		this.weight = weight;
		this.dueDate = dueDate;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Integer getQuestionCount() {
		return questionCount;
	}

	public void setQuestionCount(Integer questionCount) {
		this.questionCount = questionCount;
	}

	public Integer getApprovlCount() {
		return approvlCount;
	}

	public void setApprovlCount(Integer approvlCount) {
		this.approvlCount = approvlCount;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Instant getDueDate() {
		return dueDate;
	}

	public void setDueDate(Instant dueDate) {
		this.dueDate = dueDate;
	}
	
}