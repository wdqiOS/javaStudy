
/*
Override原则：一同两小一大
一同：实例方法签名必须相同。（方法签名 = 方法名 + 方法的参数列表）
两小：
    1）子类方法的返回值类型是和父类方法的返回值相同或者是其子类，子类可以返回一个更加具体的类。
    2）子类方法声明抛出的异常类型和父类方法声明抛出的异常类型相同或者是其子类

一大：子类方法的访问权限比父类方法访问权限更大或相等。

private修饰的方法不能被子类所继承，也就不存在覆盖的概念。

只有方法存在覆盖的概念，字段没有覆盖。
方法覆盖解决的问题：当父类的某一个行为不符合子类具体的特征的时候，此时子类需要重新定义父类的方法，并重写方法体。

 */
// 鸟类
class Bird {
    public void fly() {
        System.out.println("我在仰望，自由飞翔！");
    }
}

// 企鹅
class Penguin extends Bird {

    // 重新定义了fly，覆盖了父类中的fly
    @Override // 判断当前子类的方法是否覆盖了父类的方法
    public void fly() {
        System.out.println("折翼的天使，飞不起！");
    }
}



// 方法覆盖
class OverrideDemo {
    public static void main(String[] args) {
        // 创建企鹅对象，并调用其飞翔方法
        Penguin p = new Penguin();
        p.fly(); // 先从子类中去寻找fly方法，如果找到就执行；如果找不到，继续去父类中找

    }
}