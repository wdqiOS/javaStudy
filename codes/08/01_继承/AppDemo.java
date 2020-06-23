
/*
    static不能和super和this共存
    static是类
    super、this是对象
 */
class SuperClass {
    public String name = "SuperClass.name";
    public static void ooxx(){};
}

class SubClass extends SuperClass {
    public int name = 18;

    public void doWork() {
        boolean name = false;
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    public static void ooxx() {}; // 隐藏，不叫覆盖
}

class AppDemo {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.doWork();
    }
}