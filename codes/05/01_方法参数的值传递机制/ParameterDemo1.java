// 方法参数的值传递机制之基本数据类型（值传递）
public class ParameterDemo1 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("main方法前，x=" + x);
        change(x); // 改变x变量
        System.out.println("main方法后，x=" + x);
    }

    // 修改变量
    static void change(int x) {
        System.out.println("change方法前，x=" + x);
        x = 50;
        System.out.println("change方法后，x=" + x);
    }
}