package com.edoc.dao;

import java.util.List;
import java.util.Map;

public interface BaseMapper<T> {
	public int insert(Map<String, Object> map);
	public int delete(Map<String, Object> map);
	public int update(Map<String, Object> map);
	public List<T> find(Map<String, Object> map);
	public int findCount(Map<String, Object> map);
}
