package com.lz.animal;

/**
 * final class：该类没有子类 public final class / final public class final
 * 修饰的是方法：表示该方法不能被子类重写,但是可以正常被子类继承使用 
 * final 修饰方法内部的局部变量：只要在具体被使用之前进行赋值即可，一旦赋值不允许被修改
 * 		类中成员属性：赋值过程：1、定义直接初始化；2、构造方法；3、构造代码块
 * final 不能修饰构造方法
 */
public class Animal {
	/**
	 * private: 只允许在本类中进行访问 public: 允许在任意位置访问 protected:
	 * 允许在当前类、同包子类/非子类、跨包子类调用；跨包非子类不允许 默认：允许在当前类、同包子类/非子类调用；跨包子类/非子类不允许调用
	 */
	private String name = "妮妮"; // 昵称
	protected int month = 2; // 月份
	String species = "动物"; // 品种
	final public int temp = 15;
	private static int st1 = 22;
	public static int st2 = 32;
	static {
		System.out.println("我是父类的静态代码块");
	}

	{
		System.out.println("我是父类的构造代码块");
	}

	// 无参构造方法，父类的构造方法不允许被继承，不允许被重写，但是会影响子类对象的实例化
	public Animal() {
		System.out.println("我是父类的无参构造方法");
	}

	public Animal(String name, int month) {
		this.setName(name);
		this.setMonth(month);
		System.out.println("我是父类的带参构造方法");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getMonth() {
		return month;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}

	// 吃东西
	public void eat() {
		System.out.println(this.getName() + "在吃东西!");
	}

	public void eat(String name) {
		final int temp; // 方法内的局部变量
		System.out.println(name + "在吃东西！");
		temp = 12;
		System.out.println(temp);
		
		final Animal animal = new Animal("嘿嘿", 2);
//		animal = new Animal(); // final修饰不能被修改
		animal.month = 12; // 属性值可以修改
		animal.name = "豆豆";
		
		
	}

	// 重写基类Object：equals方法
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Animal temp = (Animal) obj;
		if (this.getName().equals(temp.getName()) && (this.getMonth() == temp.getMonth()))
			return true;
		else
			return false;

	}

	// 方法重载
	public boolean equals(Animal obj) {
		if (obj == null)
			return false;
		if (this.getName().equals(obj.getName()) && (this.getMonth() == obj.getMonth()))
			return true;
		else
			return false;
	}

	// 重写toString
	public String toString() {
		return "昵称:" + this.getName() + "；年龄：" + this.getMonth();
	}
	
	
	public Animal create() {
		return new Animal();
	}
	
}
