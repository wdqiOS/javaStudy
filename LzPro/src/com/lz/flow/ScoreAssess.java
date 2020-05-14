package com.lz.flow;

import java.util.Scanner;

public class ScoreAssess {

	public static void main(String[] args) {
		/*
		 * 成绩大于等于90输出优
		 * 大于等于80小于90输出良
		 * 大于等于60小于80输出中
		 * 小于60输出不及格
		 */
		System.out.println("请输入成绩：");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("优");
		} else if(score >= 80 & score < 90 ) {
			System.out.println("良");
		} else if(score >= 60 & score < 80 ) {
			System.out.println("中");
		} else {
			System.out.println("不及格");
		}
		
		
		/*
		int a = 5, b = 4, c = 3, d = 2;
		if(a > b && b > c) {
			System.out.println(d);
		} else if ((c-1>=d)==1) { // 代码错误
			System.out.println(d+1);
		} else {
			System.out.println(d+2);
		}
		*/
		
		// 根据输入的值，判断y值
		System.out.println("请输入x的值：");
		Scanner n = new Scanner(System.in);
		int x = n.nextInt();
		int y;
		if(x > 0)
			y = 1;
		else if(x == 0)
			y = 0;
		else
			y = -1;
		
		System.out.println("x="+x+",y="+y);
		
		
	}

}
