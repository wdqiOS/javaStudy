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

    public void say() {
        // 调用父类中的fly方法
        super.fly();
    }
}


// super关键字
class SuperDemo {
    public static void main(String[] args) {
        Penguin p = new Penguin();
        p.say();
    }
}