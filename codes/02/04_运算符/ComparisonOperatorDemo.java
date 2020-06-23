// 比较运算符
public class ComparisonOperatorDemo {
    public static void main(String[] args) {
        // = : 表示赋值；==:表示比较是否相等
        boolean b1 = 4 == 4;
        System.out.println(b1); // true
        System.out.println(4 != 4); // false
        System.out.println(3 != 4); // true

        System.out.println(100 > 5); // true
        System.out.println(5 < 100); // true

        System.out.println(100 > 100); // false
        System.out.println(100 >= 100); // true

        System.out.println(100 < 100); // false
        System.out.println(100 <= 100); // true
    }
}