package com.banksystem.entity.account;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.banksystem.entity.transactionrecord.TransactionRecord;

public class Account implements Serializable {
	private Integer aid;
	private String 	cardNo;
	private String password;
	private Double balance;
	private Integer status;
	private Set<TransactionRecord> tset = new HashSet<TransactionRecord>();
	
	@Override
	public String toString() {
		return "Account：aid=" + aid + ", cardNo=" + cardNo + ", password=" + password + ", balance=" + balance
				+ ", status=" + status;
	}
	public Account() {
		super();
	}
	public Account(Integer aid, String cardNo, String password, Double balance, Integer status) {
		super();
		this.aid = aid;
		this.cardNo = cardNo;
		this.password = password;
		this.balance = balance;
		this.status = status;
	}
	
	
	public Set<TransactionRecord> getTset() {
		return tset;
	}
	public void setTset(Set<TransactionRecord> tset) {
		this.tset = tset;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	
}
