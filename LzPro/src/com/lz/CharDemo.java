package com.lz;

public class CharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("字符型");
		// 字符
		char a = 'a';
		System.out.println("a=" + a);
		char ch = 65;
		// 如果字面值超出char类型所表示的数据范围，需要进行强制类型转换。
		char ch1 = (char)65536;
		System.out.println("ch1="+ch1);
		System.out.println("ch="+ch);
		
		// Unicode编码
		char c = '\u005d';
		System.out.println("c="+c);
		
		// boolean:true、false
		boolean t = false;
		System.out.println("t="+t);
		
	}

}
