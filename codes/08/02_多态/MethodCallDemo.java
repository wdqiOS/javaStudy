
class SuperClass {
    public void doWork() {
        System.out.println("Super.doWork！");
    }
}

class SubClass extends SuperClass {

}

// 多态时方法调用
class MethodCallDemo  {
    public static void main(String[] args) {
        SuperClass cls = new SubClass();
        cls.doWork();
    }
}