package com.lz.flow1;

public class PlusDemo {

	public static void main(String[] args) {
		// 求1到100的累加和
		int n = 1;
		int sum = 0;
		while(n <= 100) {
			sum += n;
			n++;
		}
		System.out.println("1到5的累加和为："+sum);
		// 求1+3+5+7+9+...+15
		int x = 1;
		int sum2 = 0;
		while(x < 16) {
			sum2 += x;
			x += 2;
		}
		System.out.println(sum2);
		
	}

}
