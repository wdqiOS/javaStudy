// 面试题分析
class ArithmeticOperatorsDemo3 {
    public static void main(String[] args) {
        int num1 = 1;
        num1 = num1 ++;
        System.out.println(num1);
        int num2 = 1;
        num2 = ++ num2;
        System.out.println(num2);

        System.out.println("----------------------------");
        int i = 5;
        i++;
        System.out.println("i=" + i); // 6
        ++i;
        System.out.println("i=" + i); // 7
        System.out.println("----------------------");
        int a = ++i;
        System.out.println("a=" + a); // 8
        System.out.println("i=" + i); // 8
        int b = i++;
        System.out.println("b=" + b); // 8
        System.out.println("i=" + i); // 9
    }
}