// float、double类型
public class DecimalDemo {
    public static void main(String[] args) {
        // 小数常量（默认是double类型的）
        System.out.println(3.14); // double类型的常量8个字节
        System.out.println(3.14F);// float类型的常量4个字节
        System.out.println(3.14E2);//314.0
        // 小数变量
        // 小数类型 变量名  = 小数常量;
        double pi = 3.14;
        float pi2 = 3.14F;

        double a = 1.0000000000001234;
        double b = 1.0000000000001234;
        System.out.println(a + b);

    }
}