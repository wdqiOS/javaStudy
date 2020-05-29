package com.lz.set;

import java.util.Date;

public class Notice {
	// 成员属性
	private int id; // ID
	private String title; // 标题
	private String creator; // 创建人
	private Date createTime; // 创建时间
	
	// 有参构造方法
	public Notice(int id, String title, String creator, Date createTime) {
		super();
		this.id = id;
		this.title = title;
		this.creator = creator;
		this.createTime = createTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
