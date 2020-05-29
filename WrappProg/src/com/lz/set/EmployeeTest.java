package com.lz.set;

import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em1 = new Employee(1, "张三", 5000);
		Employee em2 = new Employee(2, "李四", 5500);
		Employee em3 = new Employee(3, "王五", 4000);
		
		ArrayList list = new ArrayList();
		list.add(em1);
		list.add(em2);
		list.add(em3);
		System.out.println("员工姓名		员工薪资");
		for(int i = 0; i < list.size(); i++) {
			Employee temp = (Employee)(list.get(i));
			System.out.println(temp.getName()+"		"+temp.getSalary());
		}
	}
}
