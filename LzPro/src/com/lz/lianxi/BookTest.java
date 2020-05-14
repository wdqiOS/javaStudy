package com.lz.lianxi;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("红楼梦", "曹雪芹", "人民文学出版社", 8.0);
		book.bookInfo();
		System.out.println("==============================");
		Book book1 = new Book("小李飞刀", "古龙", "中国长安出版社", 55.5);
		book1.bookInfo();
		
	}

}
