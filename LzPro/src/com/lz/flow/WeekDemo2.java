package com.lz.flow;

import java.util.Scanner;

public class WeekDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入表示星期的英文单词：");
		String week = sc.next();
		week = week.toUpperCase();
		switch (week) {
		case "MONDAY":
			System.out.println("星期一");
			break;
		case "TUESDAY":
			System.out.println("星期二");
			break;
		case "WEDNESDAY":
			System.out.println("星期三");
			break;
		case "THURSDAY":
			System.out.println("星期四");
			break;
		case "FRIDAY":
			System.out.println("星期五");
			break;
		case "SATURDAY":
			System.out.println("星期六");
			break;
		case "SUNDAY":
			System.out.println("星期日");
			break;
		default:
			System.out.println("单词输入错误！");
		}
		
		// 判断是否为元音字符
		System.out.println("请输入一个字符：");
		Scanner ch = new Scanner(System.in);
		String c = ch.next();
		switch(c) {
		case "a": {
			System.out.println(c + "是元音字符!");
			break;
		}
		case "e": {
			System.out.println(c + "是元音字符!");
			break;
		}
		case "i": {
			System.out.println(c + "是元音字符!");
			break;
		}
		case "o": {
			System.out.println(c + "是元音字符!");
			break;
		}
		case "u": {
			System.out.println(c + "是元音字符!");
			break;
		}
		default: 
			System.out.println(c+"不是元音字符！");
		}
		
//		System.out.println(1/0);
	}

}
