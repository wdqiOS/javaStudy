package com.lz.lianxi;

public class Book {
	private String title; // 书名
	private String author; // 作者
	private String publisher; // 出版社
	private double price; // 价格
	
	// 构造方法实现对属性赋值
	public Book(String title, String author, String publisher, double price) {
		this.title = title;
		this.author = author;
		this.setPublisher(publisher);
		this.setPrice(price);
	}
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price < 10) {
			System.out.println("图书价格不可以低于10元!");
			this.setPrice(10.0);
		}
		else 
			this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}


	// 描述图书信息
	public void bookInfo() {
		System.out.println("书名："+ this.title);
		System.out.println("作者："+ this.author);
		System.out.println("出版社："+ this.publisher);
		System.out.println("价格："+ this.price + "元");
	}
	
}
