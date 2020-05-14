package com.lz.string;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("JAVA编程基础，我喜欢java编程");

		// indexOf(int ch)
		System.out.println("字符‘A’在字符串中第一次出现的位置：" + str.indexOf('A'));
		// int indexOf(String str)
		System.out.println("子串\"编程\"在字符串中第一次出现的位置：" + str.indexOf("编程"));

		// lastIndexOf(int ch)
		System.out.println("字符‘A’在字符串中最后一次出现的位置：" + str.lastIndexOf('A'));

		// int lastIndexOf(String str)
		System.out.println("子串\"编程\"在字符串中最后一次出现的位置：" + str.lastIndexOf("编程"));

		System.out.println("在字符串index值为8的位置开始，查找子串\"编程\"在字符串中第一次出现的位置："+str.indexOf("编程", 8));
		System.out.println("===========================");
		// 练习：
		String testStr = "abcdefg";
		// 取出子串cde
		String subStr = testStr.substring(2, 5).toUpperCase();
		System.out.println(subStr);
		subStr = subStr.replaceAll("DE", "MM");
		System.out.println(subStr);
		
	}

}
