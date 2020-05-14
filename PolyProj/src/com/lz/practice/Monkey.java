package com.lz.practice;

public class Monkey extends Animal implements IAct {

	private String Type;
	
	public Monkey() {
		
	}
	public Monkey(String name, int age, String Type) {
		this.setName(name);
		this.setAge(age);
		this.setType(Type);
	}
	
	// 成员属性set/get方法
	public void setType(String Type) {
		this.Type = Type;
	}
	public String getType() {
		return Type;
	}
	
	// 重写父类
	@Override
	public void love() {
		// TODO Auto-generated method stub
		System.out.println("喜好：喜欢模仿人的动作表情");
	}
	// 实现IAct接口
	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("表演者："+this.getName()+"\n"+
				"年龄："+this.getAge()+"岁"+"\n"+
				"品种："+this.getType()
			);
		this.love();
		System.out.println("技能：骑独轮车过独木桥");
	}

}
