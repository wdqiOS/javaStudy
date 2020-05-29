package com.lz.set;
/**
 * 学生
 * @author wangdaqiang
 *
 */
public class Student {
	// 成员属性
	private int num; // 学号
	private String name; // 姓名
	private Double score; // 成绩
	// 有参构造方法
	public Student(int num, String name, Double score) {
		super();
		this.num = num;
		this.name = name;
		this.score = score;
	}
	// setter/getter方法
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	
	// 重新输出方法
	@Override
	public String toString() {
		return "[学号：" + num + ", 姓名：" + name + ", 成绩：" + score + "]";
	}
	
	// 重写hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		result = prime * result + ((score == null) ? 0 : score.hashCode());
		return result;
	}
	// 重写equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		if (score == null) {
			if (other.score != null)
				return false;
		} else if (!score.equals(other.score))
			return false;
		return true;
	}
	
	
	
}
