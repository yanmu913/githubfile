package com.edoc.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Entry implements Serializable {
	private Integer id;
	private Integer categoryid;
	private String title;
	private String summmary;
	private String uploader;
	private Date createDate;
	private String createDateShow;
	
	
	public String getCreateDateShow() {
		return createDateShow;
	}
	public void setCreateDateShow() {
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		this.createDateShow = formater.format(this.createDate);
	}
	
	public Entry(Integer categoryid, String title, String summmary, String uploader, Date createDate) {
		super();
		this.categoryid = categoryid;
		this.title = title;
		this.summmary = summmary;
		this.uploader = uploader;
		this.createDate = createDate;
	}
	public Entry() {
		super();
	}
	public Entry(Integer id, Integer categoryid, String title, String summmary, String uploader, Date createDate) {
		super();
		this.id = id;
		this.categoryid = categoryid;
		this.title = title;
		this.summmary = summmary;
		this.uploader = uploader;
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Entry [id=" + id + ", categoryid=" + categoryid + ", title=" + title + ", summmary=" + summmary
				+ ", uploader=" + uploader + ", createDate=" + createDate + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummmary() {
		return summmary;
	}
	public void setSummmary(String summmary) {
		this.summmary = summmary;
	}
	public String getUploader() {
		return uploader;
	}
	public void setUploader(String uploader) {
		this.uploader = uploader;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
		this.setCreateDateShow();
	}

}
