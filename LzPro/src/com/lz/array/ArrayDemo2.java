package com.lz.array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// 数组元素的最大值
		int[] a = {100,34,45,58,30,99};
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("最大值为："+max);
		
		for(int n:a) {
			System.out.println(n);
		}

	}

}
