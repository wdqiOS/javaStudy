// 引用数据类型：字符串
// 字符串演示程序
public class StringDemo {
    public static void main(String[] args) {
        // String的常量
        System.out.println("Hello world!");
        // String变量
        String name = "强17";
        System.out.println("name="+name);
        // 输出"Hello",转义符
        System.out.println("\"He\nllo\"");
        name = "我是"+"Will"+",今年17岁";
        System.out.println(name);
        System.out.println("----------------------------------");
        System.out.println(8 + 7 + "Hello"); // 15Hello
        System.out.println("Hello" + 8 + 7); // Hello87
        System.out.println(7 + "Hello" + "8"); // 7Hello8
        String str = 17 + "ABC"; // 组成一个新的字符串
        System.out.println(str);
        // String str2 = (String)17 + "ABC"; // 错误: 不兼容的类型: int无法转换为String
    }
}