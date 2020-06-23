// 在8大基本数据类型中，boolean不属于数值类型，不参与转换
public class TypeConvertDemo {
    public static void main(String[] args) {
        /*
            byte的二级制：00000101
            short的二进制：00000000_00000101
            int的二级制：00000000_00000000_00000000_00000101 
         */
        byte b1 = 5;
        short s1 = b1; // 小转换为大
        int i1 = s1;
        long l1 = i1;

        float f1 = l1; // long -> float;
        double d1 = f1;
        System.out.println(d1); // 5.0

        //============================
        //强制类型转换
        float f2 = (float)d1; // double--->float
        System.out.println(f2);
        double pi = 3.14;
        int i2 = (int)pi;
        System.out.println(i2);

        // 直接把double类型的常量，赋给int类型的变量i3
        int i3 = (int)(3.14 + 1.2);
        System.out.println(i3);

        // 整数常量，默认是int类型
        byte b2 = 125; // 编译器底层偷偷转换了

        double d2 = 123 + 1.1F + 99L + 3.14;
        System.out.println(d2);
        System.out.println('A' + 1);

        byte b4 = 25;
        // b4变量加上 3 之后，在赋给b4变量
        // b4 = b4 + 3; // 错误: 不兼容的类型: 从int转换到byte可能会有损失
        // String和任何数据使用+连接起来，结果都是String(字符串)

    }
}