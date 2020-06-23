
class Outer {

}

// 演示局部内部类
class LocalInnerClassDemo {
    static String name = "xxx";
    public static void main(String[] args) {
        final int age = 17;
        // 局部内部类
        class Inner {
            // static String info = "INFO";
            String info = "INFO";
            public void test() {
                System.out.println(name); // 可以直接外部类的成员变量
                System.out.println(info);
                System.out.println(age);
                // age = 19; // 错误: 无法为最终变量age分配值
            }
        }

        // System.out.println(new Inner().info);
        new Inner().test();
    }
}