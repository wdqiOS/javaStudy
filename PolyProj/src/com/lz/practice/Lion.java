package com.lz.practice;

public class Lion extends Animal implements IAct {
	// 成员属性
	private String color;
	private String sex;
	
	// 无参构造
	public Lion() {
		
	}
	
	// 有参构造
	public Lion(String name, int age, String color, String sex) {
		this.setAge(age);
		this.setName(name);
		this.setColor(color);
		this.setSex(sex);
	}
	
	// 成员属性set/get
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	

	// 重写父类love
	@Override
	public void love() {
		// TODO Auto-generated method stub
		System.out.println("爱好：喜欢吃各种肉类");
	}

	// 实现IAct接口方法
	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("表演者："+this.getName()+"\n"+
			"年龄："+this.getAge()+"岁"+"\n"+
			"性别："+this.getSex()+"\n"+
			"毛色："+this.getColor()
		);
		this.love();
		System.out.println("技能：擅长钻火圈");
	}

}
