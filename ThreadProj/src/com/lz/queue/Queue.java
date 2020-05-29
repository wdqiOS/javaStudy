package com.lz.queue;

public class Queue {
	private int n;
	boolean flag = false;
	
	public synchronized int get() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("消费："+n);
		flag = false; // 消费完成，容器中没有数据
		notifyAll();
		return n;
	}
	public synchronized void set(int n) {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("生产："+n);
		this.n = n;
		flag = true; // 生产完成，容器中有数据
		notifyAll(); // 唤醒等待的线程
	}
}
