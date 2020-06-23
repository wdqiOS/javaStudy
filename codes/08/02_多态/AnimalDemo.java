// 普通动物
class Animal {
    public void eat() {
        System.out.println("吃一般的食物！");
    }
}
// 狗继承动物
class Dog extends Animal {
    public void eat() {
        System.out.println("吃🦴！");
    }
}
// 猫继承动物
class Cat extends Animal {
    public void eat() {
        System.out.println("吃🐟！");
    }
}

// 饲养员
class Person {
    /*
    // 不使用多态
    // 喂养狗的方法
    public void feed(Dog d) {
        System.out.println("喂食……");
        d.eat();
    }
    // 喂养猫的方法
    public void feed(Cat c) {
        System.out.println("喂食……");
        c.eat();
    }
    */
    // 使用多态
    public void feed(Animal a) {
        System.out.println("feeding………");
        a.eat();
    }

}

// 多态
class AnimalDemo {
    public static void main(String[] args) {
        // 创建狗对象
        Dog d = new Dog();
        d.eat();
        // 创建猫对象
        Cat c = new Cat();
        c.eat();

        System.out.println("--------------- 多态 -----------");
        // 饲养员
        Person p = new Person();
        /*
        // 不使用多态
        p.feed(d); // 喂狗
        p.feed(c); // 喂养猫
        */
        // 使用多态
        p.feed(d);
        p.feed(c);
    }
}