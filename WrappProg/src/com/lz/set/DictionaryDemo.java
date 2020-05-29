package com.lz.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DictionaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> animal = new HashMap<String, String>();
		System.out.println("请输入三组单词对应的注释，并存放到HashMap中");
		Scanner console = new Scanner(System.in);
		// 添加数据
		int i = 0;
		while (i < 3) {
			System.out.println("输入key值(单词)：");
			String key = console.next();
			System.out.println("请输入value值(注释)：");
			String value = console.next();
			animal.put(key, value);
			i++;
		}
		// 打印输出value
		System.out.println("********* 使用迭代器输出所有value ***********");
		Iterator<String> it = animal.values().iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("---------------------打印输出key value ------------");
		// 打印输出key value
		// 通过entrySet方法
		System.out.println("通过entrySet方法得到");
		Set<Entry<String, String>> entrySet = animal.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.print(entry.getKey() + "-");
			System.out.print(entry.getValue() + "\n");
		}

		// 通过单词找到注释并输出
		// 使用keySet方法
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("输出要查找的单词：");
		String strSearch = console.next();
		// 1. 取得keySet
		Set<String> keySet = animal.keySet();
		// 2. 遍历keySet
		for(String key:keySet) {
			if(key.equals(strSearch)) {
				System.out.println("扎到了！"+"键值对为："+key+"-"+animal.get(key));
				break;
			}
		}
		
		
		// 练习
//		practice();
	}

	// 练习
	public static void practice() {
		// 练习
		// 定义HashMap的对象并添加数据
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(2014, "德国");
		map.put(2010, "西班牙");
		map.put(2006, "意大利");
		map.put(2002, "巴西");
		map.put(1998, "法国");
		// 使用迭代器的方式遍历
		System.out.println("使用EntrySet进行输出:");
		Iterator<Entry<Integer, String>> mapIt = map.entrySet().iterator();
		while (mapIt.hasNext()) {
			Entry<Integer, String> en = mapIt.next();
			System.out.println(en.getKey() + "-" + en.getValue());
		}

		// 快速遍历
		System.out.println("使用entrySet进行快速遍历:");
		for (Entry<Integer, String> en : map.entrySet()) {
			System.out.println(en.getKey() + "-" + en.getValue());
		}

	}

}
