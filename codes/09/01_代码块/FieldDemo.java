
class SuperClass {
    public String name = "Super.name";

    public void doWork() {
        System.out.println("Super.doWork");
    }
}

class SubClass extends SuperClass {
    public String name = "Sub.name";
    public void doWork() {
        System.out.println("Sub.doWork");
    }
}

// 字段不存在多态特征
class FieldDemo {
    public static void main(String[] args) {
        System.out.println("Hello,world!");

        SuperClass clz = new SubClass();
        clz.doWork(); // Sub.doWork

        System.out.println(clz.name); // Super.name
    }
}