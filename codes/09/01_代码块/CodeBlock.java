
// 代码块
/*

    根据代码定义的位置不同，分成三种形式：
    1）局部代码块：直接定义在方法内部的代码块；
    2）初始化代码块/构造代码块：直接定义在类中
    3）静态代码块：使用static修饰的初始化代码块,在主方法执行之前执行静态代码块，而且只执行一次。
 */
class CodeBlock  {
    {
        System.out.println("初始化代码块");
    }

    CodeBlock() {
        System.out.println("构造器....");
    }

    static {
        System.out.println("静态初始化代码块");
    }

    public static void main(String[] args) {
        {
            // 局部代码块
            int age = 17;
            System.out.println(age);
        }
        System.out.println("hello，world！");
        // 
        new CodeBlock();
        new CodeBlock();
        new CodeBlock();
    }
}