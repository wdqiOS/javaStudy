package com.lz.model;

/**
 * 专业类
 * 
 * @author wangdaqiang
 *
 */
public class Subject {
	// 成员属性：学科名称、学科编号、学制年限、报名选修的学生信息、报名选修的学生个数
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudents = new Student[200];
	private int studentNum;

	// 无参构造方法
	public Subject() {

	}

	// 带参构造，实现对学科名称、编号、学制年限赋值
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}

	// 带参构造，实现对学科名称、编号、学制年限赋值、报名选修的信息
	public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudents) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
		this.setMyStudents(myStudents);
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectName() {
		return this.subjectName;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public String getSubjectNo() {
		return this.subjectNo;
	}

	// 设置学制年限，限制必须 > 0
	public void setSubjectLife(int subjectLife) {
		if (subjectLife <= 0)
			return;
		this.subjectLife = subjectLife;
	}

	public int getSubjectLife() {
		return this.subjectLife;
	}

	/**
	 * 获取选修专业的学生信息 如果保存学生信息的数组未被初始化，则，先初始化长度200
	 * 
	 * @return 保存学生信息的数组
	 */
	public Student[] getMyStudents() {
		if (this.myStudents == null)
			this.myStudents = new Student[200];
		return myStudents;
	}

	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	/**
	 * 专业介绍的方法
	 * 
	 * @return 专业介绍的相关信息，包括名称、编号、年限
	 */
	public String info() {
		String str = "专业信息如下：\n专业名称：" + this.getSubjectName() + "\n专业编号：" + this.getSubjectNo() + "\n学制年限："
				+ this.getSubjectLife();
		return str;
	}
	/**
	 * 将学生添加到学生数组中
	 * @param stu 学生对象
	 */
	public void addStudent(Student stu) {
		/**
		 * 1、将学生保存到数组中
		 * 2、将学生个数保存到studentNum
		 */
		// 1、将学生保存到数组中
		for(int i = 0; i < this.getMyStudents().length; i++) {
			if(this.getMyStudents()[i] == null) { 
				stu.setStudentSubject(this);
				this.getMyStudents()[i] = stu;
				// 2、将学生个数保存到studentNum
				this.setStudentNum(i+1);
				return;
			}
		}
	}
}
