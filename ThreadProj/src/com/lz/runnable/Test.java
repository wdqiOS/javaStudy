package com.lz.runnable;

class PrintRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 1;
		while(i <= 10) {
			System.out.println(Thread.currentThread().getName()+"正在运行"+(i++));
		}
		
	}
}

class Cat implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()+"A Cat");
		}
	}
	
}

class Dog implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()+"A Dog");
		}
	}
	
}

public class Test {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"正在运行！");
		
		PrintRunnable pr = new PrintRunnable();
		Thread t1 = new Thread(pr);
		t1.start();
		
		PrintRunnable pr1 = new PrintRunnable();
		Thread t2 = new Thread(pr1);
		t2.start();
		
		
		// 练习
		
		Cat c = new Cat();
		Thread tc = new Thread(c);
		tc.start();
		
		Dog d = new Dog();
		Thread dc = new Thread(d);
		dc.start();
		
		for(int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()+ " thread");
		}
		
	}

}
