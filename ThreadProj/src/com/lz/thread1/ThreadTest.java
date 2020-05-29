package com.lz.thread1;

class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(getName()+"正在运行"+i);
		}
	}
}

class PracticeThread extends Thread {
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("打印机正在打印"+(i+1));
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt1 = new MyThread("线程1");
		MyThread mt2 = new MyThread("线程2");
		mt1.start();
		mt2.start();
		
		
		// 练习
		PracticeThread pt = new PracticeThread();
		pt.start();
	}

}
