package com.lz.practice;

public class BallTest {
	
	
	public void playBall(Ball ball) {
		ball.play();
	}
	
	public void info() {
		// 方法内部类
		class Inner_f implements Ball{
			@Override
			public void play() {
				// TODO Auto-generated method stub
				System.out.println("*************************");
				System.out.println("方法内部类");
				System.out.println("打乒乓球");
			}
			
		}
		new Inner_f().play();
	}
	
	// 成员内部类
	class Inner_m implements Ball {
		@Override
		public void play() {
			System.out.println("成员内部类");
			System.out.println("打篮球");
		}
	}
}
