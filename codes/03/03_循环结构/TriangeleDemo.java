// 输出三角形
class TriangeleDemo {
    public static void main(String[] args) {
        /*
        System.out.println("*"); // 第一行
        System.out.println("**"); // 第二行
        System.out.println("***"); // 第三行
        System.out.println("****"); // 第四行
        System.out.println("*****"); // 第五行1
        */
        for (int line = 1; line <= 5; line++) {
            for (int i = 0; i < line; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}