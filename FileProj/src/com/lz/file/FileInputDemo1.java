package com.lz.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo1 {

	public static void main(String[] args) {
		// /Users/wangdaqiang/Desktop/javaStudy/file/score.txt
		// 创建FileInputStream对象
		try {
			FileInputStream fis = new FileInputStream("/Users/wangdaqiang/Desktop/javaStudy/file/score.txt");
			
			int n = 0;
//			int n = fis.read();
//			while(n!=-1) {
//				System.out.print((char)n);
//				n = fis.read();
//			}
			while((n=fis.read())!=-1) {
				System.out.print((char)n);
			}
			
			// 关闭文件输出流
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
