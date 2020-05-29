package com.lz.bank;
//存款
public class SaveAccount implements Runnable {
	Bank bank;
	public SaveAccount(Bank bank) {
		this.bank = bank;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		bank.saveAccount();
	}
	
}
