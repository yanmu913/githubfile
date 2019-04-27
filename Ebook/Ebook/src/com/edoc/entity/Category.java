package com.edoc.entity;

import java.io.Serializable;

public class Category implements Serializable {
	private Integer id;
	private String name;
	
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
	public Category(String name) {
		super();
		this.name = name;
	}
	
	public Category() {
		super();
	}
	public Category(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
