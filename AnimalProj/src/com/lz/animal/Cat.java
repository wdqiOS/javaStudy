package com.lz.animal;

public class Cat extends Animal {
	private double weight; // 体重
	public static int st3 = 44;
	static {
		System.out.println("我是子类静态代码块");
	}
	{
		System.out.println("我是子类构造代码块");
	}
	
	public static void say() {
		
	}
	
	// 无参构造方法
	public Cat() {
		System.out.println("我是子类无参构造方法");
	}
	
	public Cat(String name, int month) {
		/**
		 *  子类构造默认调用父类无参构造方法，
		 *  可以通过super()调用父类允许被访问的其他构造方法
		 *  super()必须放在子类构造方法有效代码的第一行
		 */
		super(name, month);
		System.out.println("我是子类带参构造方法");
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
	public void run() {
		System.out.println(this.getName()+"是一只"+this.getSpecies()+"，它在快乐的奔跑！");
	}
	
	@Override // 注解：
	public void eat() {
		// TODO Auto-generated method stub
//		super.eat();
	}
	
	@Override
	public Cat create() {
		// TODO Auto-generated method stub
		return new Cat();
	}
}
