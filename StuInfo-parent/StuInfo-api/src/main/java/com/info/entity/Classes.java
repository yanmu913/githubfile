package com.info.entity;

import java.io.Serializable;

/**
 * 班级实体类
 * @author wangshen
 *
 */
public class Classes implements Serializable{
	private Integer claId;//班级id
	private String claName;//班级名
	
	
	@Override
	public String toString() {
		return "claId=" + claId + ", claName=" + claName ;
	}
	public Classes() {

	}
	public Classes(Integer claId, String claName) {
		this.claId = claId;
		this.claName = claName;
	}
	public Integer getClaId() {
		return claId;
	}
	public void setClaId(Integer claId) {
		this.claId = claId;
	}
	public String getClaName() {
		return claName;
	}
	public void setClaName(String claName) {
		this.claName = claName;
	}
	
	
}
