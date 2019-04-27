package com.edoc.service.entry;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edoc.dao.entry.EntryMapper;
import com.edoc.entity.Entry;
@Service("entryService")
public class EntryServiceImpl implements EntryService {
	@Autowired
	EntryMapper entryMapper;
	
	@Override
	public int insert(Map<String, Object> map) {
		
		return entryMapper.insert(map);
	}

	@Override
	public int delete(Map<String, Object> map) {
		
		return entryMapper.delete(map);
	}

	@Override
	public int update(Map<String, Object> map) {
		
		return entryMapper.update(map);
	}

	@Override
	public List<Entry> find(Map<String, Object> map) {
		
		return entryMapper.find(map);
	}

	@Override
	public int findCount(Map<String, Object> map) {
		
		return entryMapper.findCount(map);
	}

}
