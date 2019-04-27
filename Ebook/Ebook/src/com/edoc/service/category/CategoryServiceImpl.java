package com.edoc.service.category;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edoc.dao.category.CategoryMapper;
import com.edoc.entity.Category;
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryMapper categoryMapper;
	
	@Override
	public List<Category> find(Map<String, Object> map) {		
		
		return categoryMapper.find(map);
	}

}
