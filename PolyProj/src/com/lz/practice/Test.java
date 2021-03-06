package com.lz.practice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BallTest test = new BallTest();
		// 成员内部类
		test.new Inner_m().play();
		// 方法内部类
		test.info();

		// 匿名内部类
		test.playBall(new Ball() {

			@Override
			public void play() {
				// TODO Auto-generated method stub
				System.out.println("**************");
				System.out.println("匿名内部类");
				System.out.println("打排球");
			}

		});

		// 练习测试
		int temp = -1;
		do {
			System.out.println("************* 欢迎来到太阳马戏团 ***********");
			System.out.println("*************** 请选择表演者 ***********");
			System.out.println("***************	  1、棕熊	   ***********");
			System.out.println("***************	  2、狮子	   ***********");
			System.out.println("***************	  3、猴子   ***********");
			System.out.println("***************	  4、鹦鹉   ***********");
			System.out.println("***************	  5、小丑   ***********");
			Scanner sc = new Scanner(System.in);
			try {
				temp = sc.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("输入的数据格式有误，不能有非数字！");
				sc.next();
			}
			if(temp == 0) { // 表示退出表演
				System.out.println("您已经退出!");
				break;
			} else if(temp == 1 || temp == 2 || temp == 3 || temp == 4) {
				Animal animal = null;
				
				if(temp == 1)
					animal = new Bear("Bill", 1);
				else if(temp == 2)
					animal = new Lion("Lain", 2, "灰色", "公狮");
				else if(temp == 3)
					animal = new Monkey("Monkey", 2, "长尾猴");
				else if(temp == 4)
					animal = new Parrot("鹦鹉", 10, "巴西金刚");
				
				animal.act();
			} else if(temp == 5) {
				Clown clown = new Clown("小丑", 20);
				clown.act();
			}
			System.out.println("是否继续观看（1/0）");
			sc = new Scanner(System.in);
			try {
				temp = sc.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("输入的数据格式有误，不能有非数字！");
				sc.next();
			}
			if(temp != 0) {
				temp = -1;
			} else {
				System.out.println("您已经退出!");
				break;
			}
		} while (temp != 0);
	}

}
