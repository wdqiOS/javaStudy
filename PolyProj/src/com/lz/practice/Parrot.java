package com.lz.practice;

public class Parrot extends Animal implements IAct {
	// 成员属性
	private String type;
	
	// 构造方法
	public Parrot() {
		
	}
	
	public Parrot(String name, int age, String type) {
		this.setName(name);
		this.setAge(age);
		this.setType(type);
	}
	
	// get/set方法
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	

	@Override
	public void love() {
		// TODO Auto-generated method stub
		System.out.println("爱好：喜欢吃坚果和松子");
	}

	// 实现IAct方法
	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("表演者："+this.getName()+"\n"+
				"年龄："+this.getAge()+"岁"+"\n"+
				"品种："+this.getType()
			);
		this.love();
		System.out.println("技能：擅长模仿");
	}

}
