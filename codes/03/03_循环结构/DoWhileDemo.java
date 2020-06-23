// do while循环，先执行循环体，再判断条件表达式
class DoWhileDemo {
    public static void main(String[] args) {
        // 叫500声帅哥
        int count = 0;
        do {
            count ++;
            System.out.println("帅哥！" + count);
        } while( count < 5);


        // 案例：从1数到100
        int num = 1;
        do {
            System.out.println(num);
            num ++;
        } while(num <= 100);

        // 案例：计算100以内正整数之和
        int number = 1;
        int result = 0; // 最终的和
        do {
            result += number;
            number ++;
        } while(number <= 100);
        System.out.println(result);
    }

    

}