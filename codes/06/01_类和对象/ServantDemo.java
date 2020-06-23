// 菲佣类型/描述了菲佣对象/包括菲佣的状态和行为
class Servant {
    String name; // 姓名
    int age; // 年龄

    void shopping(){
        System.out.println("买菜...");
    }
    void cook() {
        System.out.println("做饭...");
    }
    void wash() {
        System.out.println("洗碗...");
    }

    // 
    @Override
    public String toString() {
        return "name:" + name + "age:" + age;
    }
}

// 工程师
class Coder {
    void coding() {
        System.out.println("疯狂的写代码....");
    }
}

// 演示菲佣类(Servant类的测试类)
public class ServantDemo {
    public static void main(String[] args) {
        System.out.println("hello, wolrd!");
        Servant s1 = new Servant(); // 创建一个菲佣对象
        System.out.println(s1.name + "," + s1.age);
        // 给菲佣s1起名和设置年龄
        s1.name = "小丽";
        s1.age = 18;
        System.out.println(s1.name + "," + s1.age);

        // 创建另一个菲佣对象s2
        Servant s2 = new Servant();
        s2.name = "Lucy";
        s2.age = 20;

        // 创建另一个菲佣对象s3
        Servant s3 = new Servant();
        s3.name = "丽丽";
        s3.age = 30;


        System.out.println(s1);

        
        // 指挥小丽的买菜、做饭、洗碗方法
        s1.shopping();
        s1.cook();
        s1.wash();

        // s1.coding(); // 错误: 找不到符号
        Coder c1 = new Coder();
        c1.coding();

        /* 空指针异常
        s1 = null;
        System.out.println(s1.name + "," + s1.age); // java.lang.NullPointerException
        */
    }
}