package com.lz.join;

class MyThread extends Thread {
	
	public void run() {
		for(int i = 1; i <= 500; i++) {
			System.out.println(getName()+"正在执行"+i+"次！");
		}
	}
}

public class JoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		System.out.println(mt.getPriority());
		mt.start();
		try {
			// mt.join(); // 等待mt线程执行完之后继续执行后续			
			mt.join(1); // 等待mt线程执行1毫秒后执行后续
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 1; i <= 20; i++) {
			System.out.println("主线程运行第"+i+"次！");
		}
		System.out.println("主线程运行结束！");
	}

}
