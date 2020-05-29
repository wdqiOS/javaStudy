package com.lz.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// 创建File对象
//		File file1 = new File("/Users/wangdaqiang/Desktop/javaStudy/score.txt");
//		File file1 = new File("/Users/wangdaqiang/Desktop/","javaStudy/score.txt");
		File file = new File("/Users/wangdaqiang/Desktop/");
		File file1 = new File(file, "javaStudy/score.txt");
		// 判断是文件还是目录
		System.out.println("是否是目录："+file1.isDirectory());
		System.out.println("是否是文件："+file1.isFile());
		
		// 创建目录
		File file2 = new File("/Users/wangdaqiang/Desktop/javaStudy/set/HashSet");
		if(!file2.exists()) { // 是否存在HashSet目录
//			file2.mkdir(); // 创建一级目录
			file2.mkdirs(); // 创建多级目录set/HashSet
		}
		
		// 创建文件
		if (!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		// 练习
		File f = new File("/Users/wangdaqiang/Desktop/javaStudy/file");
		if(!f.exists()) { // 如果file目录不存在
			f.mkdir(); // 创建file目录
		}
		File f1 = new File(f, "Monday.docx");
		if(!f1.exists()) {
			try {
				if(f1.createNewFile()) {
					System.out.println("文件名称："+f1.getName());
					System.out.println("文件上一级目录："+f1.getParent());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("文件名称："+f1.getName());
			System.out.println("文件上一级目录："+f1.getParent());
		}
		
		// 判断是文件还是目录
		if(f1.isFile()) {
			System.out.println("文件/目录:"+"这是一个文件");
		}
		if(f1.isDirectory()) {
			System.out.println("文件/目录:"+"这是一个目录");
		}
		
		if(f1.canRead() && f1.canWrite()) {
			System.out.println("读写性：这个文件即可以读还可以写");
		} else if(f1.canRead()) {
			System.out.println("读写性：这个文件可以读不可以写");
		} else if(f1.canWrite()) {
			System.out.println("读写性：这个文件不可以读只可以写");
		}
		
		
	}

}
