package com.lz.operator;

import java.util.Scanner;

public class LeepYearDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入年份：");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		// 闰年：能被4整除但不能被100整除，或者能被400整除
		if(((year % 4 == 0) & (year % 100 != 0)) | (year % 400 == 0)) {
			System.out.println(year+"是闰年！");
		} else {
			System.out.println(year+"不是闰年！");
		}
		
		
		int a = 3, b = 4;
		boolean max = (a > 2) && (b++ > 10);
		System.out.println(b);
		System.out.println(max);
	}

}
