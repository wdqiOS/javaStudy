package com.lz.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 将英文单词添加到HashSet中
		Set<String> set = new HashSet<String>();
		// 添加元素
		set.add("blue");
		set.add("red");
		set.add("black");
		set.add("yellow");
		set.add("white");
		// 显示内容
		System.out.println("集合中的元素为：");
		printSet(set);

		// 插入元素
		System.out.println();
		set.add("green");
		printSet(set);
		
		// 插入重复元素，插入失败，但是不会报错
		System.out.println("\n插入重复元素后的输出结果：");
		set.add("white");
		printSet(set);
		
	}

	public static void printSet(Set<String> set) {
		// 将set中元素放进迭代器中
		Iterator it = set.iterator();
		// 遍历迭代器，并输出元素
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
