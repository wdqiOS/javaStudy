// 变量操作
public class VarDemo {
    public static void main(String[] args) {
        /*
            1）变量定义格式：
                数据类型 变量名;
            如： int age;
            2）给变量赋值（初始化）
                变量名 = 声明变量类型的常量值;
            3) 在声明变量的时候，并做初始化
                数据类型 变量名 = 声明变量类型的常量值;
                int age = 17;

            注意：变量必须初始化（赋值）之后才能使用，初始化才是真正的在内存分配空间。
         */
        int age; // 定义一个int类型的变量，变量名为age
        age = 17; // 把17这个常量值，赋给age变量
        System.out.println(age); // 打印变量age，其实打印的是该变量当前赋予的值
        age = 18;
        System.out.println(age);
        // int age = 17;
        // age = 3.14; // 类型不匹配
        // 同时定义多个变量
        // int a, b, c; // 不推荐
        /*
            int a;
            int b;
            int c;
         */
        
    }
}