// 交换两个变量的值
public class SwapVarDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a=" + a + ",b=" + b);
        System.out.println("------------------- 方式一：临时变量 ------------------");
        // 方式一：临时变量
        tempFun(a, b);

        System.out.println("------------------- 方式二：算术运算 ------------------");
        // 方式二：算术运算
        a = b - a;
        b = b - a;
        a = a + b;
        System.out.println("a=" + a + ",b=" + b);

        System.out.println("------------------- 方式三：异或运算 ------------------");
        System.out.println(100 ^ 5 ^ 5);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a=" + a + ",b=" + b);

    }

    /**
     * 临时变量
     * @param a 交换的
     * @param b [description]
     */
    public static void tempFun(int a, int b) {
        int temp = a; // 把a的值赋给临时变量temp
        a = b; // 把b的值存储到a中
        b = temp; // 把temp的值存储到b中
        System.out.println("a=" + a + ",b=" + b);
    }
}