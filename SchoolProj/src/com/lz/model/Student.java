package com.lz.model;

/**
 * 学生
 * 
 * @author wangdaqiang
 *
 */
public class Student {
	// 成员属性：学号、姓名、性别、年龄、专业
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;

	// 无参构造
	public Student() {

	}

	// 多参构造方法，实现对学号、姓名、性别、年龄的赋值
	public Student(String studentNo, String studentName, String studentSex, int studentAge) {
		this.setStudentName(studentName);
		this.setStudentNo(studentNo);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
	}

	// 多参构造方法，实现对全部属性的赋值
	public Student(String studentNo, String studentName, String studentSex, int studentAge, Subject studentSubject) {
		this.setStudentName(studentName);
		this.setStudentNo(studentNo);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
		this.setStudentSubject(studentSubject);
	}

	/**
	 * 获取专业对象，如果没有实例化，先实例化后再返回
	 * 
	 * @return 专业对象
	 */
	public Subject getStudentSubject() {
		if (this.studentSubject == null)
			this.studentSubject = new Subject();
		return studentSubject;
	}

	public void setStudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}

	/**
	 * 给性别赋值，限定性别只能是男或女，反之，赋值为男
	 * 
	 * @param studentSex 传递的性别
	 */
	public void setStudentSex(String studentSex) {
		if (studentSex.equals("男") || studentSex.equals("女"))
			this.studentSex = studentSex;
		else
			this.studentSex = "男";
//		if(studentSex != "男" & studentSex != "女") 
//			this.studentSex = "男";
//		else 
//			this.studentSex = studentSex;
	}

	public String getStudentSex() {
		return studentSex;
	}

	/**
	 * 给年龄赋值，限定必须在10---100之间，反之赋值为18
	 * 
	 * @param studentAge 传入的年龄
	 */
	public void setStudentAge(int studentAge) {
		if (studentAge < 10 || studentAge > 100)
			this.studentAge = 18;
		else
			this.studentAge = studentAge;
	}

	public int getStudentAge() {
		return studentAge;
	}

	/**
	 * 学生自我介绍的方法
	 * 
	 * @return 自我介绍的信息，包括姓名、学号、性别、年龄
	 */
	public String introduction() {
		String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n所报专业名称："
				+ this.getStudentSubject().getSubjectName() + "\n专业年限：" + this.getStudentSubject().getSubjectLife();
		return str;
	}

	/**
	 * 学生自我介绍的方法
	 * 
	 * @param subjectName 所学专业
	 * @param subjectLife 学制年限
	 * @return 自我介绍的信息，包括姓名、学号、性别、年龄、所学专业、学制年限
	 */
	public String introduction(String subjectName, int subjectLife) {
		String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n所报专业：" + subjectName + "\n学制年限："
				+ subjectLife;
		return str;
	}

	/**
	 * 学生自我介绍的方法
	 * 
	 * @param mySubject 所选专业的对象
	 * @return 自我介绍的信息，包括姓名、学号、性别、年龄、所学专业、学制年限
	 */
	public String introduction(Subject mySubject) {
		String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n所报专业：" + mySubject.getSubjectName()
				+ "\n学制年限：" + mySubject.getSubjectLife() + "\n专业编号：" + mySubject.getSubjectNo();
		return str;
	}
}
