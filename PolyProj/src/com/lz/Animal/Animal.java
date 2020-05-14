package com.lz.Animal;

// 抽象类：不允许实例化，可以通过向上转型，指向子类实例，public位置可以和abstract位置互换
public abstract class Animal {
	// 属性：昵称、年龄
	private String name;
	private int month;

	// 无参构造方法
	public Animal() {

	}

	// 有参构造方法
	public Animal(String name, int month) {
		this.setName(name);
		this.setMonth(month);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	// 方法：吃东西
	// 抽象方法：不允许包含方法体；子类中需要重写父类中的抽象方法，否则，子类也是抽象类；
	// static静态的，只能当前类调用
	// final最终的：不能被子类继承
	// private私有的，只能当前类或实例调用；
	// static、final、private不能与abstract并存
	public abstract void eat();

	// 静态方法
	public static void say() {
		System.out.println("动物间打招呼");
	}
}
