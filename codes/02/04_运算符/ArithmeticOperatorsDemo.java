// 算术运算符：用来处理四则运算的复合
public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        // 操作数
        System.out.println(10 + 2);
        System.out.println(10 - 2);
        System.out.println(10 * 2);
        System.out.println(10 / 2);
        System.out.println("-----------------------------");
        // 操作字符
        System.out.println('A' + 'B'); // 131
        // 操作字符串表示连接
        System.out.println("AAA" + "BBB"); // AAABBB

        // / 除
        System.out.println(10 / 3); // 3
        System.out.println(9876 / 1000 * 1000); // 9000


        // System.out.println(1 / 0); // ArithmeticException: / by zero
        // System.out.println(100.0 / 0); // Infinity 正无穷大
        // System.out.println(-100.0 / 0); // -Infinity负无穷大
        System.out.println(0.0 / 0.0); // NaN,Not a Number。自己都不等于自己
        double a = 0.0 / 0.0;
        System.out.println(a == a); // false
        System.out.println("ending...........");

        // % 取余
        System.out.println(10 % 3);
    }
}