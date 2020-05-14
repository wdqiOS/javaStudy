package com.lz.flow1;

public class JiechengPlus {

	public static void main(String[] args) {
		long s = 1, sum = 0;
		for(int i = 1; i <= 20; i++) {
			
			s = 1;
			for(int j = 1; j <= i; j++) {
				s = s * j; // s存放阶乘计算结果
			}
			sum += s;
		}
		System.out.println("1!+2!+3!+4!+...+20!="+sum);
		
		
		int k = 0;
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j < 5; j++) {
				if(j % 2 == 0) continue;
				k = k + j;
			}
		}
		System.out.println("k="+k);

		int[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println(arr.length);
	}

}
