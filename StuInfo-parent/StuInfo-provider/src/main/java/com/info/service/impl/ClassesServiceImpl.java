package com.info.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.info.dao.ClassesMapper;
import com.info.entity.Classes;
import com.info.service.ClassesService;
@Service(version="1.0")
public class ClassesServiceImpl implements ClassesService  {

	@Resource
	private ClassesMapper classesMapper;

	@Override
	public List<Classes> find() {
		return classesMapper.find();
	}

}
