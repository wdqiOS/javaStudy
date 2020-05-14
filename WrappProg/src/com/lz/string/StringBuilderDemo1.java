package com.lz.string;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		// 定义一个字符串"你好"
		StringBuilder str = new StringBuilder("你好");
		System.out.println("拼接前："+str);
		// 在"你好"后面添加内容，将字符串变成"你好，lz"
		// append
		str.append(',').append("li!");
		System.out.println("拼接后："+str);
		
		// 将字符串编程"你好,lz!"
		// 两种方式
		// 1. 使用delete方法删除lz，然后再插入LZ
		str.delete(3, 5).insert(str.length()-1, "LZ");
		System.out.println("delete后："+str);
		// 2. 使用replace方法直接替换
		System.out.println("replace替换后："+str.replace(3, str.length()-1, "lz"));
		
		// 取出字符串"你好"
		System.out.println(str.substring(0, 2));
		
		
		// 练习：
		StringBuilder str1 = new StringBuilder("欢迎来到");
		// 后面添加北京
		str1.append("北京");
		str1.delete(0, 4).insert(0, "你好!");
		str1.replace(2, 3, ",");
		System.out.println(str1);
		
		// 练习2：
		StringBuilder str2 = new StringBuilder("abc");
		str2.reverse().insert(0, "fed---").delete(3, 6);
		System.out.println(str2);
	}

}
