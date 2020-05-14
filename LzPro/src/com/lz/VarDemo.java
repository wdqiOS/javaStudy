package com.lz;

public class VarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义连个整型变量
//		int x = 0,y = 5;
		int x, y;
		x=3;
		y=5;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		// 换行问题
		System.out.print(x+"\t"+y+'\n');
//		System.out.println(); // 换行
		System.out.print(x+","+y);
		System.out.println("\n\'"+x+"\'");
		
		// 定义汉字字符
		char ch = '慕';
		System.out.println(ch);
		char 中文 = '中'; // 不建议中文作为变量名
		System.out.println(中文);
		
		// 用科学计数法表示浮点型数据
		double d = 1.23E5; // 1.23 * 10 ^ 5
		float f = 1.23e5f;
		double d1 = .2; // 0.2
		System.out.println("d="+d);
		System.out.println("f="+f);
		System.out.println("d1="+d1);
		
		
		
	}

}
