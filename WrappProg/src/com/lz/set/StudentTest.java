package com.lz.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		// 定义三个学生类对象即一个HashSet类
		Student stu1 = new Student(1,"William", 65.0);
		Student stu2 = new Student(2,"Tom", 87.0);
		Student stu3 = new Student(3,"Lucy", 95.0);
		// 定义HashSet实例
		Set<Student> set = new HashSet<Student>();
		// 将学生对象添加到Set实例中
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		// 使用迭代器显示Student类的对象中的内容
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
