// return:结束所在的方法
class ReturnDemo {
    public static void main(String[] args) {
         for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;  // 终止循环
            }
            System.out.println(i);
        }
        System.out.println("ending.....");
        System.out.println("--------------------------------");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                return;  // 结束所在的方法
            }
            System.out.println(i);
        }
        System.out.println("ending......");
    }
}