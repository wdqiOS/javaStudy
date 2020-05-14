package com.lz.operator;

import java.util.Scanner;

public class ConditionDemo2 {

	public static void main(String[] args) {
		// if-else语句
		System.out.println("if-else语句");
		// 判断一个整数是奇数还是偶数
		// 定义一个变量
		int n = 10;
		// 从键盘接收数据
		System.out.println("请输入一个整数：");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		if(n % 2 == 0) {
			System.out.println(n+"是偶数!");
		} else {
			System.out.println(n+"是奇数!");
		}
		
		
	}

}
