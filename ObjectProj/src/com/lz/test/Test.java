package com.lz.test; // 定义包

// 导入类方法一：加载包下所有类
//import com.lz.animal.*; // 加载com.lz.animal下所有类
// 导入类方法二：导入指定类
import com.lz.animal.Cat; // 加载com.lz.animal下的Cat类
//导入类方法三：直接代码中导入包中指定类
//com.lz.animal.CatTest tex = new com.lz.animal.CatTest();

//import com.lz.mechanics.*;

public class Test {
	public static void main(String[] args) {
//		Cat cat = new Cat();
//		CatTest tex = new CatTest();
		// 直接加载com.lz.animal.CatTest
//		com.lz.animal.CatTest tex = new com.lz.animal.CatTest();
		Cat one = new Cat();
		one.setName("花花");
		one.setMonth(2);
		one.setSpecies("英国短毛猫");
		// 静态成员访问方式：1、对象名访问；2：类名访问
		one.price = 2000;
		Cat.price = 3000;
		one.eat();
		Cat.eat();
		
		Cat two = new Cat();
		two.setName("凡凡");
		two.setMonth(1);
		two.setSpecies("中华田园猫");
		two.price = 150;
		
		System.out.println(one.getName() + "的售价："+ one.price);
//		System.out.println(two.getName() + "的售价："+ two.price);
		
		
	}
}
