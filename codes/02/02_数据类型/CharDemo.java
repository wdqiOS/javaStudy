// char 字符类型:数据范围 [0, 2的16次方-1]，表示16位的无符号整数或者Unicode字符，两个字节可以表示一个汉字。
// 
public class CharDemo {
    public static void main(String[] args) {
        /*
            char常量的3种表现形式：
                1、直接使用单个字符来指定字符串常量。格式如'♦'、'A'、'7':此时得使用单引号直接表示符号
                2、直接作为十进制整数数值使用，但是数据范围在[0, 65535]，格式如：97，但是打印出来的值依然是ASCII码表
                3、和2一样，只不过表示的是16进制的数值，
         */
        char c1 = 'A'; // 直接表示符号
        System.out.println(c1);
        char c2 = 65; // 表示符号对应的10进制顺序
        System.out.println(c2);
        char c3 = '\u0041'; // 使用16进制的顺序
        System.out.println(c3);
        char data = '哥';
        System.out.println(data);
    }
}