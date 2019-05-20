package com.banksystem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.banksystem.dao.account.AccountDao;
import com.banksystem.entity.account.Account;
import com.banksystem.service.AccountService;
import com.banksystem.util.PageAssistant;

public class AccountServiceImpl implements AccountService {
	

	private AccountDao accountDao;
	
	
	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void insert(Account t) {
		accountDao.insert(t);
		
	}

	@Override
	public void delete(Account t) {
		accountDao.delete(t);
		
	}

	@Override
	public void update(Account t) {
		accountDao.update(t);
		
	}

	@Override
	public List<Account> select(String hql, Object... param) {
		
		return accountDao.select(hql, param);
	}

	@Override
	public int count(String hql, Object... param) {
		
		return accountDao.count(hql, param);
	}

	@Override
	public PageAssistant<Account> selectByPage(PageAssistant<Account> pa, String hql, Object... param) {
		
		return accountDao.selectByPage(pa, hql, param);
	}

}
