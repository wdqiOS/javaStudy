package com.lz.flow;

public class IntCompare {

	public static void main(String[] args) {
		// 定义两个整型变量
		int x = 10, y = 10;
		// 判断x和y是否相等
		if(x!=y) {
			if(x>y) {
				System.out.println(x+"大于"+y);
			} else {
				System.out.println(x+"小于"+y);
			}
		} else {
			System.out.println(x+"和"+y+"相等");
		}
		
		
		// switch展示
		char ch = '8';
		int r = 10;
		System.out.println(ch+1); // ch+1 == 57(ASCII码值对应的是字符9) 
		switch(ch+1) {
		case '7': r = r + 3;
		case '8': r = r + 5;
		case '9': r = r + 6;
		break;
		default: r = r + 8;
		}
		System.out.println("r="+r);
		
	}
}
