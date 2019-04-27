package com.edoc.util;

public class PageTool {
	
	private int currPage=1;//当前页
	private int totalPage;//总页数
	private int allCount;//总数
	private int pageSize=3;//每页显示条数
	private int start=0;//起始位置
	
	
	
	public int getCurrPage() {
		return currPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
		this.setStart();
		
	}
	public int getTotalPage() {
		return totalPage;
	}
	
	public void setTotalPage() {
		if((this.allCount%this.pageSize)==0) {
			this.totalPage=this.allCount/this.pageSize;
		}else {
			this.totalPage=this.allCount/this.pageSize+1;
		}
	}
	
	public int getAllCount() {
		return allCount;
	}
	public void setAllCount(int allCount) {
		this.allCount = allCount;
		this.setTotalPage();
		this.setStart();
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		this.setTotalPage();
	}
	public int getStart() {
		return start;
	}
	public void setStart() {
		this.start = (this.currPage-1) * this.pageSize;
	}
	
}
