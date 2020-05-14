package com.lz.animal;

public class CatTest {

	public static void main(String[] args) {
		// 对象实例化
		Cat one = new Cat();
//		Cat three = new Cat("小花");
//		Cat two = new Cat();
		Cat two = one;
//		Cat one; // 声明对象
//		one.month = -3;
		// 测试
		one.eat();
		one.run();
//		one.name = "花花"; // private 修饰
//		one.month = 2;
//		one.weight = 1000;
//		one.species = "英国短毛猫";
//		two.name = "凡凡";
//		two.month = 2;
//		two.weight = 1000;
//		two.species = "中华田园猫";
//		System.out.println("昵称："+ one.name);
//		System.out.println("体重："+ one.weight);
//		System.out.println("年龄："+ one.month);
//		System.out.println("品种："+ one.species);
//		one.run(one.name);
		System.out.println("-----------------------------");
//		System.out.println("昵称："+ two.name);
//		System.out.println("体重："+ two.weight);
//		System.out.println("年龄："+ two.month);
//		System.out.println("品种："+ two.species);
//		
		
		// 构造方法测试
		System.out.println("有参构造方法测试---------");
		Cat four = new Cat("花花", 2, 1000, "猫咪");
//		System.out.println(four.name);
//		System.out.println(four.month);
//		System.out.println(four.weight);
//		System.out.println(four.species);
		
		
		// 封装示例
		System.out.println("------------------封装示例-----------------------");
		Cat five = new Cat();
		five.setName("抱抱");
		System.out.println(five.getName());
		five.setMonth(-3);
		System.out.println(five.getMonth());
		
		
	}

}
