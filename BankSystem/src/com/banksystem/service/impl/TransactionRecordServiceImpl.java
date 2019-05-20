package com.banksystem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.banksystem.dao.transactionrecord.TransactionRecordDao;
import com.banksystem.entity.transactionrecord.TransactionRecord;
import com.banksystem.service.TransactionRecordService;
import com.banksystem.util.PageAssistant;

public class TransactionRecordServiceImpl implements TransactionRecordService {
	

	private TransactionRecordDao transactionRecordDao;
	
	
	public TransactionRecordDao getTransactionRecordDao() {
		return transactionRecordDao;
	}

	public void setTransactionRecordDao(TransactionRecordDao transactionRecordDao) {
		this.transactionRecordDao = transactionRecordDao;
	}

	@Override
	public void insert(TransactionRecord t) {
		transactionRecordDao.insert(t);
		
	}

	@Override
	public void delete(TransactionRecord t) {
		transactionRecordDao.delete(t);
		
	}

	@Override
	public void update(TransactionRecord t) {
		transactionRecordDao.update(t);
		
	}

	@Override
	public List<TransactionRecord> select(String hql, Object... param) {
	
		return transactionRecordDao.select(hql, param);
	}

	@Override
	public int count(String hql, Object... param) {
		
		return transactionRecordDao.count(hql, param);
	}

	@Override
	public PageAssistant<TransactionRecord> selectByPage(PageAssistant<TransactionRecord> pa, String hql,
			Object... param) {
		
		return transactionRecordDao.selectByPage(pa, hql, param);
	}

}
