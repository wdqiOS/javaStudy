package com.lz.string;

public class StringDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String的不可变性，String对象一旦被创建，则不能修改，是不可变的；所谓的修改其实是创建了新的对象，所指向的内存空间不变
		String s1 = "lz";
		s1 = "hello," + s1;
		// s1不再指向lz所在的内存空间，而是指向了“hello,lz”
		System.out.println("s1="+s1);
		
		
		String s3 = new String("hello,lz");
		System.out.println("子串:"+s3.substring(0, 5));
		System.out.println("s3="+s3);
		
	}

}
