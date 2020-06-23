// 表示人类
class Person {
    String name; // 姓名
    // 无参构造器
    Person() {

    }
    // 自定义构造器:带参构造器
    Person(String name) {
        System.out.println("-------------");
        this.name = name; // 把name参数的值赋值给name字段
        // 初始化操作：可以给字段设置初始值，也可以调用初始化方法
    }
}


// 演示自定义构造器
class PersonDemo {
    public static void main(String[] args) {
        // 创建对象，其实是调用构造器
        new Person(); // 表示调用Person类无参构造器   
    }
}