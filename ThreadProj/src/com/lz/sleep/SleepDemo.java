package com.lz.sleep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MyThread implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i <= 15; i++) {
			
			System.out.println(Thread.currentThread().getName()+"执行第"+i+"次！");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Letter implements Runnable {
	private List<Character> letter = new ArrayList<Character>();
	public Letter() {
		for(int i = 0; i < 26; i++) {
			char c = (char) (97+i);
			this.letter.add(c);
		}
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < this.letter.size(); i++) {
			System.out.print(this.letter.get(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class SleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyThread mt = new MyThread();
//		Thread t = new Thread(mt);
//		t.start();
//		
//		Thread t1 = new Thread(mt);
//		t1.start();
		
		// 练习
		Letter l = new Letter();
		Thread lt = new Thread(l);
		lt.start();
	}

}
