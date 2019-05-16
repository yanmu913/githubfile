package com.info.service;

import java.util.List;

import com.info.entity.Student;

public interface StudentService {
	/**
	 * 查找全部学生信息
	 * @return
	 */
	public List<Student> find();
	
	/**
	 * 修改学生信息
	 */
	public int update(Student student);
}
