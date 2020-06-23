// 三元运算符
public class TernaryOperatorDemo {
    public static void main(String[] args) {
        // 需求：给一个小数，需要求出四舍五入之后的结果，怎么完成该功能？
        System.out.println("hello,world!");
        /*
            1:获取小数的整数部分--3；
            2：获取小数的小数部分--0.49；
            3：把0.49和0.5做比较
                0.49 >= 0.5 ---> 3 + 1
                0.49 < 0.5 ----> 3
            三元运算符/三目运算符
            数据类型 值1/值2 = boolean表达式 ? 值1 : 值2;
         */
        double num = 3.51;
        int num1 = (int)num; // 整数部分
        double num2 = num - num1; // 小数部分
        System.out.println(num2);

        int result = num2 >= 0.5 ? num1 + 1 : num1;
        System.out.println(result);

        // 2:判断两个数最大值/最小值
        int a = 20;
        int b = 10;
        int max = a >= b ? a : b;
        System.out.println(max);

        // 3：判断一个数是偶数还是奇数
        /*
            判断一个数的奇偶，只需要判断除以2之后的余数是否为0---》偶数
                不能直接判断余数是否为1（考虑负数情况）
         */
        int number = 11;
        String ret = number % 2 == 0 ? "偶数" : "奇数";
        System.out.println(ret);

    }
}