// 父类/基类/根类
/*
    1）如果父类中的成员使用public修饰，子类继承；
    2）如果父类中的成员使用protected修饰，子类也继承，即使父类和子类不在同一个包中；
    3）如果父类和子类在同一个包中，此时子类可以继承父类中缺省修饰符的成员；‘
    4）如果父类的成员使用private修饰，子类打死都继承不到，因为private只能在本类中访问。
    5) 父类的构造器，子类也不能继承，因为构造器必须和当前的类名相同
 */
class Person {
    protected String name; // 子类可以继承，可以访问，即使不在同一个包中
    int    age; // 缺省修饰符，同一个包中子类继承可以访问

    private void sleep(){}; // 子类不能继承，只能当前类实例访问
}
// 老师
class Teacher extends Person {
    // String name;
    // int    age; 
    String level; // 级别
    // public void sleep() {};
}

// 学生
class Student extends Person {
    // String name;
    // int    age;
    String sn; // 学号

    // public void sleep() {};
}

// 员工
class Employee extends Person {
    // String name;
    // int    age;
    String hireDate; // 入职时间
    // public void sleep(){};
}

// 引出继承关系
class ExtendsDemo {
    public static void main(String[] args) {
        System.out.println("hello,world!");
        Student stu = new Student();
        stu.name = "lz";
        System.out.println(stu.sn);
        System.out.println(stu.age);
        System.out.println(stu.name);
        // stu.sleep();  // 父类使用private修饰
       
    }
}