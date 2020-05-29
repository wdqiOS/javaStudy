package com.lz.set;

import java.util.ArrayList;
import java.util.List;


public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList
		List list = new ArrayList();
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Go");
		list.add("Swift");
		// 输出列表中元素的个数
		System.out.println("列表中元素的个数:"+list.size());
		
		// 遍历输出
		System.out.println("********************");
		printEleFromList(list);
		// 移除C++
		System.out.println();
		list.remove(2);
		System.out.println("********************");
		System.out.println("移除C++以后列表中元素为:");
		printEleFromList(list);
		
		System.out.println("\n----------------练习-------------------");
		// 练习：
		List subjects = new ArrayList();
		subjects.add("语文");
		subjects.add("数学");
		subjects.add("英语");
		subjects.add("化学");
		subjects.add("物理");
		subjects.add("生物");
		System.out.println("列表中元素的个数为："+subjects.size());
		for(int i = 0; i < subjects.size(); i++) {
			System.out.println("第"+(i+1)+"个为"+subjects.get(i));
		}
		
		
	}
	
	public static void printEleFromList(List list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+",");
		}
	}

}
