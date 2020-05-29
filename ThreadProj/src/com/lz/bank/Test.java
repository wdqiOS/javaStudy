package com.lz.bank;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建账户，给定余额为1000
		Bank bank = new Bank("10001", 1000);
		// 创建线程对象
		SaveAccount sa = new SaveAccount(bank);
		DrawAccount da = new DrawAccount(bank);
		Thread save = new Thread(sa);
		Thread draw = new Thread(da);
		save.start();
		draw.start();
		try {
			draw.join();
			save.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(bank);
		
	}

}
