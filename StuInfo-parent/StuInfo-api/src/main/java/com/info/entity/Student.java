package com.info.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 学生表对应实体类
 * @author wangshen
 *
 */
public class Student implements Serializable{
	private Integer stuId ;//学生id
	private String stuName;//学生姓名
	private Date stuBirthday;//学生生日
	private String stuGender;//性别
	private String stuTelephone;//电话
	private String stuEmail;//邮箱地址
	private Integer classId;//学生所在班级id
	private Classes classes;//班级对象
	
	
	

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuBirthday=" + stuBirthday + ", stuGender="
				+ stuGender + ", stuTelephone=" + stuTelephone + ", stuEmail=" + stuEmail + ", classId=" + classId
				+ ", classes=" + classes + "]";
	}


	public Student() {

	}

	
	public Student(Integer stuId, String stuName, Date stuBirthday, String stuGender, String stuTelephone,
			String stuEmail, Integer classId, Classes classes) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuBirthday = stuBirthday;
		this.stuGender = stuGender;
		this.stuTelephone = stuTelephone;
		this.stuEmail = stuEmail;
		this.classId = classId;
		this.classes = classes;
	}


	public Integer getStuId() {
		return stuId;
	}


	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}


	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


	public Date getStuBirthday() {
		return stuBirthday;
	}


	public void setStuBirthday(Date stuBirthday) {
		this.stuBirthday = stuBirthday;
	}


	public String getStuGender() {
		return stuGender;
	}


	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}


	public String getStuTelephone() {
		return stuTelephone;
	}


	public void setStuTelephone(String stuTelephone) {
		this.stuTelephone = stuTelephone;
	}


	public String getStuEmail() {
		return stuEmail;
	}


	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}


	public Integer getClassId() {
		return classId;
	}


	public void setClassId(Integer classId) {
		this.classId = classId;
	}


	public Classes getClasses() {
		return classes;
	}


	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	
	
	
}
