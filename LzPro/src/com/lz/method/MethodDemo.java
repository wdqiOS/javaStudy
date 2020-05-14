package com.lz.method;

import java.util.Scanner;

public class MethodDemo {
	// 打印输出*号的方法
	public void printStar() {
		System.out.println("****************************");
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		sc.next();
		// 创建一个MethodDemo类的对象myMethodDemo
		MethodDemo myMethodDemo = new MethodDemo();
		// 调用对象名.方法名()去调用方法
		myMethodDemo.printStar();
		
//		System.out.println("****************************");
		System.out.println("欢迎来到Java的世界！");
//		System.out.println("****************************");
		myMethodDemo.printStar();
	}

}
