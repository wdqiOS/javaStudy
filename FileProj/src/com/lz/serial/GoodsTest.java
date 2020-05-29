package com.lz.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GoodsTest {

	public static void main(String[] args) {
		// Goods类对象
		Goods goods1 = new Goods("good1", "电脑", 1000);
		// 先写
		try {
			FileOutputStream fos = new FileOutputStream("imooc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			FileInputStream fis = new FileInputStream("imooc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			 
			 // 将对象信息写入文件
			oos.writeObject(goods1);
			// 将Boolean变量写入文件
			oos.writeBoolean(true);
			oos.flush();
			
			// 读取对象信息
			try {
				Object obj = ois.readObject();
				if(obj.getClass() == Goods.class) {
					System.out.println(obj);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 读取Boolean变量，注意读取的顺序，需要与写顺序保持一致
			System.out.println(ois.readBoolean());
			
			fos.close();
			oos.close();
			fis.close();
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
