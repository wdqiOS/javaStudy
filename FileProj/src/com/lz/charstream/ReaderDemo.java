package com.lz.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "/Users/wangdaqiang/Desktop/javaStudy/file/two.txt"
//		try {
//			FileInputStream fis = new FileInputStream("/Users/wangdaqiang/Desktop/javaStudy/file/one.txt");
//			InputStreamReader isr = new InputStreamReader(fis, "GBK");
//			BufferedReader br = new BufferedReader(isr);
//			FileOutputStream fos = new FileOutputStream("/Users/wangdaqiang/Desktop/javaStudy/file/two.txt");
//			OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
//			BufferedWriter bw = new BufferedWriter(osw);
//			int n = 0;
//			char[] cbuf = new char[10];
////			while((n = isr.read()) != -1) {
////				System.out.print((char)n);
////			}
//			
////			while((n=isr.read(cbuf)) != -1) {
////				String s = new String(cbuf, 0, n);
////				System.out.println(s);
////			}
//			
//			while((n = br.read(cbuf)) != -1) {
////				String s = new String(cbuf, 0, n);
////				bw.write(s);
//				bw.write(cbuf, 0, n);
//				bw.flush();
//			}
//			
//			fis.close();
//			isr.close();
//			br.close();
//			fos.close();
//			osw.close();
//			bw.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		try {
			FileInputStream fis = new FileInputStream("one.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // 格式"UTF-8"，要保持一致
			BufferedReader br = new BufferedReader(isr);
			FileOutputStream fos = new FileOutputStream("two.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			int n = 0;
			char[] cbuf = new char[10];
//			while((n=isr.read())!=-1) {
//				System.out.print((char)n);
//			}
//			while((n=isr.read(cbuf))!=-1) {
//				String s = new String(cbuf, 0, n);
//				System.out.println(s);
//			}
			
//			while((n=isr.read(cbuf))!=-1) {
//				String s = new String(cbuf, 0, n);
////				System.out.println(s);
//				osw.write(cbuf, 0, n);
//				osw.flush();
//			}
			
			// 读取缓冲区读写
			while((n=br.read(cbuf))!=-1) {
				bw.write(cbuf, 0, n);
				bw.flush();
			}
			
			
			
			fis.close();
			fos.close();
			isr.close();
			osw.close();
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		// 练习：
		// 写入到hello.txt
		transWriteByBuf();
		transReadByBuf();
	}
	
	// 写入文件
	public static void transWriteByBuf() {
		try {
			// 写文件流
			FileOutputStream fos = new FileOutputStream("hello.txt");
			OutputStreamWriter opw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(opw);
			bw.write("你好吗？\n");
			bw.write("我很好！");
			bw.flush();
			
			fos.close();
			opw.close();
			bw.close();
			
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	// 读取文件
	public static void transReadByBuf() {
		try {
			FileInputStream frs = new FileInputStream("hello.txt");
			InputStreamReader isr = new InputStreamReader(frs);
			BufferedReader br = new BufferedReader(isr);
			String s;
			while((s=br.readLine())!= null) {
				System.out.println(s);
			}
			frs.close();
			isr.close();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
