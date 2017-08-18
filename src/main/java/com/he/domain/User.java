package com.he.domain;

import java.io.Serializable;

/**
 * 用户实体类
 * @author Administrator
 *
 */
public class User implements Serializable{
	

	private static final long serialVersionUID = 1L;

	private String id;
	
	private String name;
	
	private Integer age;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	

}
