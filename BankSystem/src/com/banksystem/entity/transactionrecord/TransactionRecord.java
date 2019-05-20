package com.banksystem.entity.transactionrecord;

import java.io.Serializable;
import java.util.Date;

public class TransactionRecord implements Serializable {
	private Integer tid;
	private String tcardNo;
	private Date transactionDate;
	private Double transactionAmount;
	private Double tbalance;
	private String transactionType;
	private String remark;
	private String newTransactionDate;
	
	
	

	@Override
	public String toString() {
		return "TransactionRecord：tid=" + tid + ", tcardNo=" + tcardNo + ", transactionDate=" + transactionDate
				+ ", transactionAmount=" + transactionAmount + ", tbalance=" + tbalance + ", transactionType="
				+ transactionType + ", remark=" + remark ;
	}
	public TransactionRecord() {
		super();
	}
	public TransactionRecord(Integer tid, String tcardNo, Date transactionDate, Double transactionAmount,
			Double tbalance, String transactionType, String remark) {
		super();
		this.tid = tid;
		this.tcardNo = tcardNo;
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
		this.tbalance = tbalance;
		this.transactionType = transactionType;
		this.remark = remark;
	}
	
	public String getNewTransactionDate() {
		return newTransactionDate;
	}
	public void setNewTransactionDate(String newTransactionDate) {
		this.newTransactionDate = newTransactionDate;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTcardNo() {
		return tcardNo;
	}
	public void setTcardNo(String tcardNo) {
		this.tcardNo = tcardNo;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public Double getTbalance() {
		return tbalance;
	}
	public void setTbalance(Double tbalance) {
		this.tbalance = tbalance;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}	
