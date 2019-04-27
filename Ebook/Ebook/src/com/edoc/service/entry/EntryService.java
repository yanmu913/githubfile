package com.edoc.service.entry;

import java.util.List;
import java.util.Map;

import com.edoc.entity.Entry;

public interface EntryService {
	public int insert(Map<String, Object> map);
	public int delete(Map<String, Object> map);
	public int update(Map<String, Object> map);
	public List<Entry> find(Map<String, Object> map);
	public int findCount(Map<String, Object> map);
}
