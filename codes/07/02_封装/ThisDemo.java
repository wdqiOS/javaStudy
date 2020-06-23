// 用户信息类
class User {
    private String  name; // 姓名
    private int     age; // 年龄

    
    User() {
        // 构造器中的this，表示当前创建的对象
        System.out.println(this);
    }

    // 创建对象，并初始化name
    User(String name) {
        this(name, 0); // 构造器互调，少调多 调用参数为String的构造器,构造器重载互调,参数越多，功能越强大
    }

    // 重在构造器，创建对象，初始化name,age
    User(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }
    

    public String getName() {
        return name; // 返回name字段的值
    }
    public void setName(String name) { // this表示当前调用的对象
        this.name = name; // 把调用者传递的name参数的值赋值给name字段
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // 打印当前对象的name和age
    public void show() {
        System.out.println(this.name + "," + this.age);
        // this.sayHello();
    }

    public void sayHello() {
        System.out.println("你好！");
        this.show();
    }
}

// static和this不能一起使用：当字节码被加载进JVM，static成员已经存在了；但是此时，对象还没有创建，没有对象就没有this
// this关键字
class ThisDemo {
    public static void main(String[] args) {

        // 创建对象设置初始初始值的两种方式：
        // 方式一：先通过无参构造器创建出一个对象，再通过对象调用相应的setter方法
        /*
        User u1 = new User();
        System.out.println(u1);
        // u1.name = "Lucy";
        u1.setName("Lucy"); // 给u1对象设置名称为Lucy
        u1.setAge(18);
        String n = u1.getName(); // 获取u1对象的名称
        System.out.println(n);

        u1.setAge(18);
        int a = u1.getAge();
        System.out.println(a);

        User u2 = new User();
        // u1.name = "Lucy";
        u2.setName("Lili"); // 给u1对象设置名称为Lucy
        u2.setAge(17);

        u1.show();
        u2.show();

        u1.sayHello();
        */

        // 方式二：直接调用带参数的构造器，创建出来的对象就有了初始值
        User u3 = new User("lz", 17);
        System.out.println(u3.getName() + "," + u3.getAge());
        u3.show();

        // 通过构造器和通过setter方法都可以完成相同的功能
        /* 
            给对象设置数据：
            1）setter注入（属性注入）
            2）构造注入

            如何选择：
                1：如果存在带参数的构造器，方式2是比较简洁的；
                2：如果在构建对象的时候，需要初始化多个数据，如果使用方式2，那么构造器得提供N个参数，参数过大，不直观，此时方式1，简单明了
                3：例如：圆对象，如何画圆，圆对象，必须根据半径来确定对象，就应该在构建圆对象的时候，就要确定圆的半径值。有时候，需要根据数据来构建对象，此时优先选用构造器方式。
        */

    }
}