package com.info.dao;

import java.util.List;

import com.info.entity.Classes;

public interface ClassesMapper {
	/**
	 * 查询所有班级信息
	 * @return
	 */
	public List<Classes> find();
}
