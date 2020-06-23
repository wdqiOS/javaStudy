// 递归操作
class RecursionDemo {
    // 斐波那契数列
    static int fn(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else { // n 不能与0和1
            return fn(n - 1) + fn(n - 2);
        }
    }
    public static void main(String[] args) {
        int ret = fn(6);
        System.out.println(ret);
    }
}