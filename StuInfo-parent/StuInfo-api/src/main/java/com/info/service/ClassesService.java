package com.info.service;

import java.util.List;

import com.info.entity.Classes;

public interface ClassesService {
	/**
	 * 查找全部班级信息
	 * @return
	 */
	public List<Classes> find();
}
