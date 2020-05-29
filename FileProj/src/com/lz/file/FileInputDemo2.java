package com.lz.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class FileInputDemo2 {

	public static void main(String[] args) {
		// 创建FileInputStream对象
		try {
			FileInputStream fis = new FileInputStream("/Users/wangdaqiang/Desktop/javaStudy/file/score.txt");
			byte[] b = new byte[100];
			fis.read(b,0,15); // 第一个参数存放的字节数组，第二个参数存放开始位置，第三个参数存放的长度
			System.out.println(new String(b));
		
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 练习
		try {
			File f = new File("/Users/wangdaqiang/Desktop/javaStudy/file/score.txt");
			FileInputStream fis = new FileInputStream(f);
			int n = 0;
			int count = 0;
			System.out.print("文本内容：");
			while((n=fis.read()) != -1) {
				System.out.print((char)n);
				count = count + 1;
			}
			
			System.out.println("\n统计结果："+f.getName()+"文件中共有"+count+"个字节");
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
