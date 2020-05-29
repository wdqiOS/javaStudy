package com.lz.serial;

import java.io.Serializable;

public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	// 属性
	private String id; // 产品id
	private String name; // 产品名称
	private String property; // 产品属性
	private double price; // 价格
	// 构造方法
	public Product(String id, String name, String property, double price) {
		super();
		this.id = id;
		this.name = name;
		this.property = property;
		this.price = price;
	}
	// setter/getter方法
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	// toString
	@Override
	public String toString() {
		return "产品ID:" + id + "\n产品名称:" + name + "\n产品属性:" + property + "\n产品价格:" + price + "元";
	}
	
}
