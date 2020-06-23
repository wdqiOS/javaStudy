// while循环
public class WhileDemo {
    public static void main(String[] args) {
        /*
        
            语法格式：
            while(boolean表达式){
                如果boolean表达式为true，就执行循环体
            }
            如果boolean表达式结果为false，则跳过循环体，不执行循环体
             如果boolean表达式一直为true，则表示死循环
         */
        int count = 0; // 次数
        while(count < 500) {
            count ++;
            System.out.println("第" + count + "次" + "帅哥");
        }
        System.out.println("ending.......");

        // 案例：从1数到100
        int num = 1;
        while(num <= 100) {
            System.out.println(num);
            num ++;
        }
        System.out.println("----------- 计算100以内的正整数的和 ------------");
        // 案例：计算100以内的正整数的和
        int number = 1; // 表示第一个加数
        int result = 0;
        while(number <= 100) {
            result += number;
            // int temp = 0;
            // System.out.print("result=");
            // while(temp <= number) {
            //     System.out.print(temp + ( temp == number ? "" : "+"));
            //     temp++;
            // }

            System.out.println("\n" + number+"和为："+result);
            number ++;
        }
        
    }
}