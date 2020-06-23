
class Outer {
    String name = "Outer.name";
    static String name2 = "name2";
    static class Inner {
        static int age = 17;
        String name = "Inner.name";

        public void test() {
            String name = "local.name";
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(name2);
            System.out.println(new Outer().name);
        }
    }
}

// 演示静态内部类
class StaticInnerClassDemo {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        System.out.println(in.name);
        in.test();

        System.out.println(Outer.Inner.age);
    }
}