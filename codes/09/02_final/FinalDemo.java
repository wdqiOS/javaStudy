
/*
    final本身的含义是：“最终的，不可改变的”，它可以修饰非抽象类，非抽象方法和变量。注意：构造方法不能使用final修饰，因为构造方法不能被继承，肯定是最终的。
    final修饰的类：表示该类为最终类，该类不能再有子类。
        只要满足以下条件，就可以把一个类设计成一个final类：
        1）某类不是专门为继承而设计；
        2）处于安全考虑，类的实现细节不许改动，不准修改源代码；
        3）确信该类不会再被拓展；
        java里final修饰的类由很多，比如八大基本数据类型保证类和String等；

    final修饰的方法：最终的方法，该方法不能被子类覆盖
        什么时候的方法需要使用final修饰：
            1）在父类中提供的统一的算法骨架，不准子类通过方法覆盖来修改，此时使用final修饰，模板方法设计模式；
            2）在构造器中调用的方法（初始化方法），此时一般使用final修饰；
        final修饰的方法，子类可以使用，不能覆盖。

    final修饰的变量：最终的变量，常量，该变量只能赋值一次，不能再赋值。
        final是唯一可以修饰局部变量的修饰符。

 */
/*
// final修饰的类
final class SuperClass { // 最终类，不能被子类继承

}

class SubClass extends SuperClass { // 错误: 无法从最终SuperClass进行继承
}
*/

/*
// final修饰的方法：最终的方法，该方法不能被子类覆盖
class SuperClass { // 最终类，不能被子类继承
    public final void doWork() {}
}

class SubClass extends SuperClass { 
    public void doWork(){}; // 错误: SubClass中的doWork()无法覆盖SuperClass中的doWork()
*/

// 常量类
class Consts {
    public static final int X_SIZE = 10;
    public static final int Y_SIZE = 10;
}

// final
class FinalDemo {

    // static String name; // 系统默认会进行初始化
    // static final String name; // 错误: 变量 name 未在默认构造器中初始化，必须显示指定初始值
    static final String name = null;

    public static void main(String[] args) {




        System.out.println("hello,world!");
        // name = "AA"; // 错误: 无法为最终变量name分配值，final修饰的常量初始化之后，不能再次进行初始化。
        System.out.println(name);

        // final修饰引用类型变量，该变量引用的地址不能变，而不是引用地址里的内容不能变。
        // final修饰基本类型变量，表示该变量的值不能改变，即不能用“=”号重新赋值
        final Person p = new Person();
        System.out.println(p.info);
        p.info = "AAA";
        System.out.println(p.info);

        // p = new Person(); // 错误: 无法为最终变量p分配值
    }
}

class Person  {
    public String info = "最初的值";
}
