class LoopInLoopControlDemo {
    public static void main(String[] args) {
        outter:for (int line = 1; line <= 9; line++) {
            inner:for (int i = 1; i <= line; i++) { 
                if (line == 5) {
                    break outter; // 结束当前循环
                }
                System.out.print(i + " * " + line + " = " + (i * line) + "\t" );
            }
            System.out.println();
        }
    }
}