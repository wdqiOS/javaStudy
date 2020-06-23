// 赋值运算符
public class AssigningOperatorDemo {
    public static void main(String[] args) {
        
        // 功能就是给变量赋值
        String name;
        name = "will"; // 赋值

        /*
            1: 声明int类型变量age；
            2：在内存中存储常量数据17；
            3：把17赋予age变量
         */
        // 声明一个int类型变量，并设置初始值为17
        int age = 17;
        System.out.println("========================");

        /*
            += 赋值符号：中间不能打空格
            int a = 10;
            a +=  5; 等价于 a = (int)(a + 5);
         */
        int a = 10;
        a += 5;
        System.out.println(a); // 15

        short s = 30;
        // s = s + 5; // 错误: 不兼容的类型: 从int转换到short可能会有损失
        s = (short)(s + 5); 
        // s += 5;
        System.out.println(s);
    }
}