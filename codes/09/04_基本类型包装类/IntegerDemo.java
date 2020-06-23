
// 演示包装类：装箱和拆箱操作
class IntegerDemo {
    public static void main(String[] args) {
        System.out.println("hello,world!");
        // 装箱操作：
        Integer i1 = new Integer(18);
        Integer i2 = Integer.valueOf(19);
        // 拆箱操作：
        int i3 = i1.intValue();
        int i4 = i2.intValue();

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println("---------------------------------");
        // 自动装箱和拆箱，也是一个语法糖/编译器级别新特性。底层依然是手动装箱和拆箱操作，但是：装箱操作使用的是Integer.valueOf()的方式，而不是直接new Integer()
        // 自动装箱
        Integer i5 = 17;
        // 自动拆箱
        int i6 = i5;

        System.out.println(i5);
        System.out.println(i6);

        Integer num = 10;
        switch(num) {
            case 1: break;
            case 2: break;
            default:
            break;
        }
    }
}