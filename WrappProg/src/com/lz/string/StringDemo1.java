package com.lz.string;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 定义一个字符串
		String str = "JAVA 编程 基础";
		// length()
		System.out.println("字符串的长度是："+str.length());
		
		// charAt(int index)
		System.out.println(str.charAt(6));
		
		// 求子串的方法
		// substring(int beginIndex)
		System.out.println(str.substring(5));
		// substring(int beginIndex, int endIndex)
		System.out.println(str.substring(5, str.length()));
		
		
		
	}

}