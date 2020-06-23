// continue控制循环结构语句
class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue;  // 跳过当前循环的循环体，进入下一次循环
            }
            System.out.println(i);
        }

        // 案例：输出100到200之间不能被3整除的数
        for (int i = 100; i <= 200; i++) {
            if (i % 3 == 0) {
                continue;
                // System.out.println(); // 错误: 无法访问的语句
            }
            System.out.println(i);
        }
    }
}