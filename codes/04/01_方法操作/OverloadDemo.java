// 方法重载
class OverloadDemo {
    /*
    // 求两个整数之和
    static int getSum1(int x, int y) {
        return x + y;
    }
    // 求两个小数之和
    static double getSum2(double x, double y) {
        return x + y;
    }
    // 分别打印String、int、boolean
    // 打印String
    static void pString(String data) {
        System.out.println(data);
    }
    // 打印int
    static void pInt(int data) {
        System.out.println(data);
    }
    // 打印boolean
    static void pString(boolean data) {
        System.out.println(data);
    }
    */
    // 方法的重载设计(overload):
    // 求两个整数之和
    static int getSum(int x, int y) {
        return x + y;
    }
    // 求两个小数之和
    static double getSum(double x, double y) {
        return x + y;
    }

    // 打印String
    static void p(String data) {
        System.out.println(data);
    }
    // 打印int
    static void p(int data) {
        System.out.println(data);
    }
    // 打印boolean
    static void p(boolean data) {
        System.out.println(data);
    }



    public static void main(String[] args) {
        getSum(1, 2); // getSum(int x, int y)方法
        getSum(1.1, 2.2); // getSum(double x, double y);

        System.out.println(true);
        System.out.println(123);
        System.out.println("hello");
    }
}