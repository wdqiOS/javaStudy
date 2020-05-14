package com.lz.practice;

public class Clown implements IAct {

	private String name;
	private int years;

	public Clown() {

	}

	public Clown(String name, int years) {
		this.setName(name);
		this.setYears(years);
	}

	// set/get方法
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public int getYears() {
		return years;
	}

	public void dress() {
		System.out.println("着装：身穿五彩服装，头上戴着彩色的帽子，脸上画着夸张的色彩");
	}

	// 实现IAct方法
	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("表演者："+this.getName());
		System.out.println("年龄："+this.getYears());
		this.dress();
		System.out.println("技能：脚踩高跷，进行杂技魔术表演");
	}

}
