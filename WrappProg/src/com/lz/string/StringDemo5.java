package com.lz.string;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// == 和 equals方法的区别
		String str1 = "lz";
		String str2 = "lz";
		String str3 = new String("lz");
		
		System.out.println("str1和str2的内容相同？"+(str1.equals(str2)));
		System.out.println("str1和str3的内容相同？"+(str1.equals(str3)));
		
		System.out.println("str1和str2的地址相同？"+(str1==str2));
		System.out.println("str1和str3的地址相同？"+(str1==str3));
	}

}
