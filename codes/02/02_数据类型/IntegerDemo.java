// 整数类型（type-short-int-long）
public class IntegerDemo {
    public static void main(String[] args) {
        /*
        1、二进制整数: 0B或0b开头（Java7的新特性）如：int a = 0B110;
        2、八进制整数：要求以0开头。如：int a = 012;
        3、十进制整数：如：int 啊= 17；
        4、十六进制整数：要求0X或0x开头。如：int a = 0X12;
         */
        // 表示十进制的常量
        System.out.println(110);
        // 表示2进制常量
        System.out.println(0b0110_1110); // byte常量 1个字节8位 -2的7次方~2的7次方-1，最高位为符号位    
        System.out.println(0b00000000_01101110);// short常量 2个字节16位取值范围：-2的16次方~2的15次方-1
        System.out.println(0b00000000_00000000_00000000_01101110);// int的常量4个字节31位取值范围-2的32次方~2的31次方-1
        // 表示8进制常量
        System.out.println(0156);
        // 表示16进制常量
        System.out.println(0x6e);

        // 整数的变量
        // 整数类型 变量 = 整数值的常量;
        int age = 17;
        System.out.println(age);

        // long类型的常量，以L标记 取值范围：-2的63次方~2的63次方-1
        long num = 123L;
        System.out.println(num);
    }
}