package com.lz.test;

import com.lz.model.Student;
import com.lz.model.Subject;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject sub1 = new Subject("计算机科学与应用", "J0001", -4);
//		System.out.println(sub1.info());
//		System.out.println("=====================================================");
		// 测试学生
		Student stu1 = new Student("S01", "张三", "男", 200);
//		System.out.println(stu1.introduction());
//		System.out.println("=====================================================");
		Student stu2 = new Student("S02", "李四", "女", 20);
//		System.out.println(stu2.introduction("计算科学与技术", 4));
//		System.out.println("=====================================================");
		Student stu3 = new Student("S03", "王五", "男", 16);
//		System.out.println(stu3.introduction(sub1));
//		System.out.println("=====================================================");
//		Student stu4 = new Student("S03", "马六", "男", 17, sub1);
//		System.out.println(stu4.introduction());
//		System.out.println("=====================================================");
		// 测试指定专业中到底有多少学生报名
		sub1.addStudent(stu1);
		sub1.addStudent(stu2);
		sub1.addStudent(stu3);
		System.out.println(sub1.getSubjectName() + "专业中已有 " + sub1.getStudentNum() + " 名学生报名！");
	}

}
