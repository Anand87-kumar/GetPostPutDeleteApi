package com.anand.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "colleges")
public class College {

	@Column(name = "class_name", nullable = false)
	private String className;

	@Column(name = "credit_hours")
	private String ch;
	@Id
	@SequenceGenerator(name="colleges",initialValue = 101)
	@Column(name = "class_id")
	private long id;
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getCh() {
		return ch;
	}
	public void setCh(String ch) {
		this.ch = ch;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

	

}
