

// 外部类
// 实例内部类
class Outter {
    String name = "Outter.name";
    public void ooxx() {
        System.out.println(new Inner().age);
    }
    // 实例内部类
    class Inner {
        int age = 17;
        String name = "Inner.name";
        public void test() {
            String name = "local.name";
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Outter.this.name);
        }
    }
}



// 演示实例内部类
class InstanceINnerClassDemo {
    public static void main(String[] args) {
        
        // 
        Outter out = new Outter();
        Outter.Inner in = out.new Inner();
        System.out.println(in);
        in.test();
    }
}