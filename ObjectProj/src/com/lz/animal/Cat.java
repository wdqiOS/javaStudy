package com.lz.animal;
/**
 * 宠物猫类
 * @author wangdaqiang
 *
 */
// static+类 ---> 不存在
public class Cat {
	// 成员属性: 昵称、年龄、体重、品种
	// 修改属性的可见性 -- private 限定只能在当前类中访问
	private String name; // 昵称 Stirng类型默认值为null
	private int month; // 年龄 int类型默认值为0
	private double weight; // 体重 double类型默认值为0.0
	private String species; // 品种 String类型默认值为null
	
	// static：静态 静态成员、类成员
	// static+属性 ---> 静态属性或者类属性
	public static int price; // 价格
	
	{
		System.out.println("我是构造代码块1");
	}
	
	static {
		System.out.println("我是构造代码块2");
	}
	static {
		System.out.println("我是构造代码块3");
		price = 20;
	}
	// 无参构造方法
	public Cat () {
		// static+方法内的局部变量 ---> 不存在
//		static int tmp = 10; // ❌
		System.out.println("我是构造方法");
	}

	
	// 创建get/set方法
	// 在get/set方法中添加对属性的限定
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return "我是一只名叫：" + this.name + "猫咪";
	}
	
	
	
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month <= 0)
			System.out.println("输入信息有误，宠物猫的年龄必须大于0");
		else 
			this.month = month;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	// 有参构造方法
	public Cat(String name) {
		this.setName(name);
		System.out.println("我是有参构造方法，我的名字是："+this.name);
	}
	
	public Cat(String name, int month, double weight, String species) {
		this.name = name;
		this.month = month;
		this.weight = weight;
		this.species = species;
	}
	
	
	// 成员方法：跑动、吃东西
	/**
	 * 跑动的方法
	 */
	// 在成员方方法中，可以直接访问类中静态成员
	public void run() {
		eat();
		this.price = 20;
		System.out.println("售价是"+ this.price +"小猫快跑");
	}
	public void run(String name) {
		System.out.println(name + "快跑");
	}
	/**
	 * 吃东西的方法
	 * static+方法 ---> 静态方法或者类方法
	 * 静态方法中不能直接访问同一个类中的非静态成员，只能直接调用同一个类中的静态成员；只能通过对象实例化后，对象.成员方法的方式访问非静态成员
	 * 静态方法中不能使用this
	 */
	public static void eat() {
		System.out.println("小猫吃鱼");
	}
	
}
