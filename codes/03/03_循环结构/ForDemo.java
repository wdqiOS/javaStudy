// for 循环
class ForDemo {
    public static void main(String[] args) {
        /*
            for(初始化语句;boolean表达式;循环之后的操作语句) {
                    循环体
            }
            执行顺序：
                1）初始化语句；
                2）boolean表达式；
                    true：进入第三步
                    false：跳过循环
                3）执行循环体
                4）执行循环体之后的操作语句
                5）进入第二步
            注意：初始化语句只在最凯斯的时候，执行一次

            一般，在for循环值的循环迭代变量起名规则：
                见过最多的循环变量名称：i,j,k,m,n
         */
        System.out.println("------------- 案例1：叫100声帅哥 -------------------");
        // 案例1：叫100声帅哥
        for (int count = 0; count < 5; count ++) {
            System.out.println("帅哥！" + count);
        }
        System.out.println("----------------- 案例2：从1数到100 ----------------");
        // 案例2：从1数到100
        for (int num = 1; num <= 100; num ++) {
            System.out.println(num);
        }
        System.out.println("---------------- 案例3：计算100以内正整数的和 --------------");
        // 案例3：计算100以内正整数的和
        int result = 0;
        for (int number = 0; number <= 100; number ++) {
            result += number;
        }
        System.out.println(result);
    }
}