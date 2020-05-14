package com.lz.method;

public class ArrayMethod {
	// 打印输出数组元素的值
	public void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("数组第"+i+"个元素为："+arr[i]);
		}
		System.out.println();
		int j = 0;
		for(int n: arr) {
			System.out.println("数组第"+j+"个元素为："+n);
			j++;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayMethod arrMethod = new ArrayMethod();
		int[] a = {1, 2, 3, 4};
		arrMethod.printArray(a);
	}

}
