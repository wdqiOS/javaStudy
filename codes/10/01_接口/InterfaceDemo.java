
// 定义一个接口
/*
    1) 接口中没有构造器，接口不能创建对象,接口中不能定义普通方法。
    2）接口定义的成员变量，实质是全局静态常量，默认使用 public static final修饰。public static final String NAME = "李哲";
    3) 接口定义的方法都是公共的抽象方法，默认的使用public abstract final来修饰
        public abstract final void walk();
    3) 接口中定义的内部类都是公共的静态内部类，默认使用public static 来修饰内部类

    标志接口：接口中没有任何成员，就仅仅是一个接口的定义，就是一个标志，其他的类实现该接口，就属于该家族，我们可以通过第三方代码赋予该接口实现类特殊的功能（不推荐）
    常量接口：使用接口来封装多个常量信息，称之为常量接口，其目的和常量类相同（不推荐）


    接口的特定和继承：
        1）没有构造方法，也不能显示定义构造器，不能实例化。
        2）接口只能继承接口，不能继承类，且接口支持多继承（类是单继承关系）。
        [修饰符] interface 接口名 extends 接口1，接口2
        3）接口里的方法全是抽象的，默认修饰符是public abstract；
        4）接口里的字段全是全局静态常量，默认修饰符是public static final
        5）接口里的内部类全是静态的，默认修饰符是public static
    
    类和类之存在的是继承关系：                使用extends来表示
    接口和接口之间只能是继承关系：             使用extends来表示
    接口和实现类之间只能是实现关系（继承关系）， 使用implements来表示

    接口的实现者：实现类
        接口仅仅只是定义了某一类事物应该具有某些功能，但是没有提供实现。
        此时，我们得提供类，再让该类去实现接口，并覆盖接口中的方法，从而实现类接口中定义的功能


 */
// 爬行动物规范
interface IWalkable {
    String NAME = "李哲"; // 全局静态常量 public static final
    void walk();
}

// 水生动物规范
interface ISwimable {
    void swim();
}
// 两栖动物规范
interface IAmphibiousable extends IWalkable, ISwimable {

}

class Animal {

}

// 猫
class Cat implements IWalkable {
    public void walk() {
        System.out.println("走猫步");
    }
}
// 鱼
class Fish extends Animal implements ISwimable {
    public void swim() {
        System.out.println("游啊游……");
    }
}

// 青蛙
// 类可以多现实接口
class Frog extends Animal implements IWalkable, ISwimable {
    public void walk() {
        System.out.println("跳啊跳！");
    }
    public void swim() {
        System.out.println("蛙泳蛙泳……");
    }
}

// 演示接口
class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("hello，world!");
        // new Cat().walk();
        // 面向接口编程，存在多态特征
        IWalkable w = new Cat(); 
        w.walk(); // 体现多态特征：执行Cat类中的walk方法

        ISwimable f = new Fish();
        f.swim();

        Frog frog = new Frog();
        frog.walk();
        frog.swim();


        // 接口实现图形面积
        Double area = new Circle(10.0).getArea();
        System.out.println(area);

        area = new Rectangle(10.0, 3.0).getArea();
        System.out.println(area);

        area = new Triangle(3.0, 4.0, 5.0).getArea();
        System.out.println(area);

    }
}


// 接口实现图形面积计算
interface Graph {
    // 求面积
    Double getArea();
}

// 圆
class Circle implements Graph{
    private Double r;

    Circle(Double r) {
        this.r = r;
    }

    public Double getArea() {
        return Math.PI * r * r;
    }
}

// 矩形
class Rectangle implements Graph {
    private Double width;
    private Double height;

    Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    } 

    public Double getArea() {
        return width * height;
    }
}

// 三角形
class Triangle implements Graph {
    private Double a;
    private Double b;
    private Double c;

    Triangle(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double getArea() {
        Double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
