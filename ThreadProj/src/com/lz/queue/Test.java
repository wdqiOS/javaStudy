package com.lz.queue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		new Thread(new Producer(queue)).start();
		new Thread(new Consumer(queue)).start();
	}

}
