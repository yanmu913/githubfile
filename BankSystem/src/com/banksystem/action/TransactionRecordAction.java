package com.banksystem.action;

import com.banksystem.entity.account.Account;
import com.banksystem.entity.transactionrecord.TransactionRecord;
import com.opensymphony.xwork2.ActionSupport;

public class TransactionRecordAction extends ActionSupport  {

	private Account account;
	private TransactionRecord transactionRecord;
	//转账金额
	private String transferMoney;
	
	public String transfer() {
		
		System.out.println("-------------TransactionRecord transfer");
		System.out.println("account:" + account+"-"+"transferMoney："+transferMoney);
		return "info";
	}
	public TransactionRecord getTransactionRecord() {
		return transactionRecord;
	}

	public void setTransactionRecord(TransactionRecord transactionRecord) {
		this.transactionRecord = transactionRecord;
	}
	public String getTransferMoney() {
		return transferMoney;
	}
	public void setTransferMoney(String transferMoney) {
		this.transferMoney = transferMoney;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
