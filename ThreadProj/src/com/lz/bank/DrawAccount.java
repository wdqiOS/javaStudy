package com.lz.bank;

// 取款
public class DrawAccount implements Runnable {
	Bank bank;
	public DrawAccount(Bank bank) {
		this.bank = bank;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		bank.drawAccount();
	}
	
}
