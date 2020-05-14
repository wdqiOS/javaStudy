package com.lz.test;

public class HotelAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HotelAgeException() {
		super("18岁以下，80岁以上的住客，必须有亲友陪同");
	}
}
