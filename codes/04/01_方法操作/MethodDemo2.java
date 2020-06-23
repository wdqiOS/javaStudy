class MethodDemo2 {
    // 无参无返回
    static void p() {
        System.out.println("----------------------------");
    }
    // 有参数无返回
    // 打印人一直
    static void pValue(String val) {
        System.out.println(val);
    }
    // 无参数有返回值
    static int getAge() {
        return 17;
    }
    // 有参数有返回值
    // 求两个数之和:getSum
    static int getSum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        MethodDemo2.p(); // 调用
        MethodDemo2.pValue("Hello"); // 传递Hello字符串
        MethodDemo2.pValue("world");
        MethodDemo2.pValue("对的");
        int age = MethodDemo2.getAge(); // 定义变量age接收返回的结果
        System.out.println(age);
        int sum = MethodDemo2.getSum(1, 2); /// 定义变量sum接收getSum返回的结果
        System.out.println(sum);
        sum = MethodDemo2.getSum(3, 4);
        System.out.println(sum);
    }
}