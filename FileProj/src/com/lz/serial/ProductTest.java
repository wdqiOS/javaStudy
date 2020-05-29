package com.lz.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProductTest {

	public static void main(String[] args) {
		// 创建Product类对象
		Product iphone = new Product("123", "iphone", "telephone", 4888.0);
		Product ipad = new Product("234", "ipad", "computer", 5088.0);
		Product macbook = new Product("345", "macbook", "computer", 10688.0);
		Product iwatch = new Product("256", "iwatch", "watch", 4799.0);
		
		try {
			
			FileOutputStream fos = new FileOutputStream("product.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			FileInputStream fis = new FileInputStream("product.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			// 存
			oos.writeObject(iphone);
			oos.writeObject(ipad);
			oos.writeObject(macbook);
			oos.writeObject(iwatch);
			
			// 取
			System.out.println("apple系列产品信息：");
//			Object obj = null;
//			do {
//				obj = ois.readObject();
//				System.out.println(obj+"\n");
//			} while(obj != null);
			System.out.println(ois.readObject()+"\n");
			System.out.println(ois.readObject()+"\n");
			System.out.println(ois.readObject()+"\n");
			System.out.println(ois.readObject()+"\n");
			
			fis.close();
			fos.close();
			oos.close();
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
