package com.lz.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo {

	public static void main(String[] args) {
		// /Users/wangdaqiang/Desktop/javaStudy/file/score.txt
		try {
			FileOutputStream fos = new FileOutputStream("/Users/wangdaqiang/Desktop/javaStudy/file/score.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			FileInputStream fis = new FileInputStream("/Users/wangdaqiang/Desktop/javaStudy/file/score.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			System.out.println(System.currentTimeMillis());
			bos.write(50);
			bos.write('c');
			bos.flush(); // 强制清空缓冲区
			
			System.out.println(bis.read());
			System.out.println((char)bis.read());
			System.out.println(System.currentTimeMillis());
			fos.close();
			bos.close();
			bis.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// /Users/wangdaqiang/Desktop/javaStudy/file/one.txt
		File f = new File("/Users/wangdaqiang/Desktop/javaStudy/file/one.txt");
		if(!f.exists()) {
			try {
				f.createNewFile();
				fileOutput(f.getPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else { // 表示存在
			fileOutput(f.getPath());
		}
		
		File f2 = new File("/Users/wangdaqiang/Desktop/javaStudy/file/two.txt");
		if(!f2.exists()) {
			try {
				f2.createNewFile();
				bufferedOutput(f2.getPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			bufferedOutput(f2.getPath());
		}
	}
	
	public static void bufferedOutput(String path) {
		FileOutputStream fos;
		BufferedOutputStream bos;
		try {
			fos = new FileOutputStream(path);
			bos = new BufferedOutputStream(fos);
			long startTime = System.currentTimeMillis();
			for(int i = 0; i < 100000; i++) {
				bos.write(i);
			}
			
			bos.flush(); // 强制清空
			long endTime = System.currentTimeMillis();
			System.out.println("two.txt使用缓冲流来写\n用时为："+(endTime-startTime)+"ms");
			bos.close();
			fos.close();
			
//			FileInputStream fis = new FileInputStream(path);
//			int n = 0;
//			while((n = fis.read()) != -1) {
//				System.out.println(n);
//			}
//			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// FileOutputStream
	public static void fileOutput(String path) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(path);
			long startTime = System.currentTimeMillis();
			for (int i = 0; i < 100000; i++) {
				fos.write(i);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("one.txt不使用缓冲流来写\n用时为："+(endTime-startTime)+"ms");
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
