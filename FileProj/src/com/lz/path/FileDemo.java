package com.lz.path;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("thread.txt");
		try {
			f.createNewFile();
//			f.isAbsolute(); // 绝对路径
			System.out.println(f.isAbsolute()); // 判断是否是绝对路径
			System.out.println(f.getPath()); // 获取相对路径
			System.out.println(f.getAbsolutePath());  // 获取绝对路径
			System.out.println(f.getName()); // 获取文件名
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.getPath());
		System.out.println(f.exists());
		
	}

}
