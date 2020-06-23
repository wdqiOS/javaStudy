class Person {
    String name; // 名称
    int    age;  // 年龄
    // 不属于某个对象，属于人类
    static int totalNum = 5; // 人的总数

    Person(String n, int a) {
        name = n;
        age = a;
        totalNum ++;
    }

    void die() {
        totalNum--;
        System.out.println("去世……");
    }

    static void destory() {
        totalNum = 0;
        System.out.println("人类毁灭……");
    }

}

// 演示static修饰符
class PersonDemo {

    String info = "xxxx";

    public static void main(String[] args) {

        // System.out.println(info);  // 在static方法中只用调用static成员，否则，报错 无法从静态上下文中引用非静态 变量 info

        System.out.println(Person.totalNum);
        Person p1 = new Person("Will", 15);
        Person p2 = new Person("Lucy", 17);
        System.out.println(Person.totalNum);
        System.out.println(p1.totalNum);
        System.out.println(p2.totalNum);

        p2.die();
        System.out.println(Person.totalNum);
        p2.destory();
        System.out.println(Person.totalNum);
    }
}