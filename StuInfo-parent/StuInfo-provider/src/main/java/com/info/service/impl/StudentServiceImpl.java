package com.info.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.info.dao.StudentMapper;
import com.info.entity.Student;
import com.info.service.StudentService;
@Service(version="1.0")
public class StudentServiceImpl implements StudentService {
	
	@Resource
	private	StudentMapper studentMapper;
	/**
	 * 查找所有学生信息
	 */
	public List<Student> find() {
		return studentMapper.find();
	}

	/**
	 * 修改学生信息
	 */
	@Transactional
	public int update(Student student) {
		return studentMapper.update(student);
	}

}
