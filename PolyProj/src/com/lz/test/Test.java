package com.lz.test;

import com.lz.Animal.Animal;
import com.lz.Animal.Cat;
import com.lz.Animal.Dog;

public class Test {
	public static void main(String[] args) {
//		Animal one = new Animal();

		/*
		 * 向上转型、隐式转型、自动转型 ---》 
		 * 父类引用指向子类实例，可以调用子类重写父类的方法以及父类派生的方法，无法调用子类特有的方法 
		 * 注意：父类中的静态方法无法被子类重写，所以向上转型之后，只能调用到父类原有的静态方法
		 * 小类转型为大类
		 */
		Animal two = new Cat();
		Animal three = new Dog(); // cmd + shit + O 快速导入

//		one.eat();
		two.eat();
		three.eat();
		
		System.out.println("++++++++++++++++++++++++++++++");
		/*
		 * 向下转型、强制类型转换
		 * 子类引用执行父类对象，此处必须进行强转，可以调用子类特有的方法
		 * 必须满足转型条件才能进行转换
		 * instanceof运算符：返回true/false		
		 */
		
		if(two instanceof Cat) { // 判断某个对象是否满足某个类的特征
			System.out.println("two可以转换成Cat类型");
			Cat temp = (Cat)two;
			temp.eat();
			temp.run();
			temp.getMonth();
		}
		
		System.out.println("++++++++++++++++++++++++++++++");
		if(two instanceof Dog) {
			System.out.println("two可以转换成Dog类型");
			Dog temp2 = (Dog)two;
			temp2.eat();
			temp2.sleep();
			temp2.getSex();
		}
		
		System.out.println("==========================");
		if(two instanceof Animal) {
			System.out.println("Animal");
		}
		if(two instanceof Object) {
			System.out.println("Object");
		}
		

	}
}
