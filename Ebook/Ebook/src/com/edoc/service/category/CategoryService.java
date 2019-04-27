package com.edoc.service.category;

import java.util.List;
import java.util.Map;

import com.edoc.entity.Category;

public interface CategoryService {
	public List<Category> find(Map<String, Object> map);
	
	
}
