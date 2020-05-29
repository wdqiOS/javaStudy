package com.lz.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo1 {

	public static void main(String[] args) {
		// 文件拷贝
		try {
			FileInputStream fis = new FileInputStream("/Users/wangdaqiang/Desktop/javaStudy/file/1.jpg");
			FileOutputStream fos = new FileOutputStream("/Users/wangdaqiang/Desktop/javaStudy/file/1copy.jpg");
			int n = 0;
			byte[] b = new byte[1024];
			while((n = fis.read(b)) != -1) {
				fos.write(b,0,n);
			}
			
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
