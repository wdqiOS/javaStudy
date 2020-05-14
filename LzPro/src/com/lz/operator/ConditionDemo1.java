package com.lz.operator;

public class ConditionDemo1 {

	public static void main(String[] args) {
		// if条件判断
		// 商品大于100减20
		double price1, price2;
		price1 = 80;
		price2 = 55;
		double sum = price1 + price2;
		// 输出原价
		System.out.println("原价为："+sum);
		if(sum >= 100) {
			sum -= 20;
		}
		System.out.println("折后价位："+sum);
	}

}
