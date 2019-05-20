package com.banksystem.service;

import java.util.List;

import com.banksystem.util.PageAssistant;

/**
 * 基础业务逻辑接口
 * @author Administrator
 *
 */
public interface BaseService<T> {

	/** 添加 */
	void insert(T t);
	/** 删除 */
	void delete(T t);
	/** 修改 */
	void update(T t);
	/** 查询(单体) */
	List<T> select(String hql, Object...param);
	/** 总记录数 */
	int count(String hql, Object...param);
	/** 分页及组合条件查询 */
	PageAssistant<T> selectByPage(PageAssistant<T> pa, String hql, Object...param);
	
}