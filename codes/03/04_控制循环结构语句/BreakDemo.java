// break
class BreakDemo {
    public static void main(String[] args) {
        // 输出1~10
        for (int i = 1; i <= 10; i++) {
            // 如果输出7，则终止循环
            if (i == 7) {
                break; // 终止当前所在循环
            }
            System.out.println(i);
        }
        System.out.println("ending.....");
        System.out.println("---------------------------------------");
        // 案例：求出100以内前5个3的倍数的数字
        // 1.循环出100以内所有的数字
        // 2.判断哪些数字是3的倍数
        // 3.如果是3的倍数，使用计数器递增1
        // 4、当计数器的值为5，就没必要继续循环了，跳出循环
        int count = 0; // 第0个3的倍数
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + "是3的倍数！");
                count ++;
            }
            if (count == 5) {
                break; // 终止当前循环
            }
        }
    }
}