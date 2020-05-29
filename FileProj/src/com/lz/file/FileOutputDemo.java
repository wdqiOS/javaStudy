package com.lz.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {

	public static void main(String[] args) {
		FileOutputStream fos;
		FileInputStream fis;
		try {
			fos = new FileOutputStream("/Users/wangdaqiang/Desktop/javaStudy/file/score.txt", true);
			fis = new FileInputStream("/Users/wangdaqiang/Desktop/javaStudy/file/score.txt");
			fos.write(50);
			fos.write('a');
				
			System.out.println(fis.read());
			System.out.println((char)fis.read());
			
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
