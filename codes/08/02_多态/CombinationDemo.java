
// 组合关系
/*
    如果A类为了得到B类的功能行为：
        如果A类是B类的一种特殊情况，我们就应该采用继承来实现；否则使用组合方式。

 */
class CombinationDemo {

    private ArrayUtil util = new ArrayUtil(); // 组合关系

    public void test() {
        int[] arr = {-2, 9, 1, 0, 5};
        util.sort(arr);
        util.print(arr);
    }

    public static void main(String[] args) {
        new CombinationDemo().test();

        new Cat().test();
    }
}

class Animal {
    public void sleep() {
        System.out.println("卖萌");
        System.out.println("发个呆");
        System.out.println("上厕所");
        System.out.println("打呼噜");
        System.out.println("做梦");
    }
}

class Dog extends Animal {
    // 继承关系
}

class Cat { // 组合关系
    private Animal a = new Animal();
    public void test() {
        a.sleep();
    }
}