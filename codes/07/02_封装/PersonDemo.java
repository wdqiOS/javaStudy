class Person {
    String name;
    private int age;

    // setter方法：专门用于给对象设置age数据，并把传过来的数据保存到对象中
    void setAge(int age) {
        if (age < 0) {
            System.out.println("你傻啊，年龄不能为负数！");
            return; // 结束方法
        }
        age = age; // 把参数age的值，赋值给成员变量age
    }

    int getAge() {
        return age;
    }
}

// 演示封装
class PersonDemo {
    public static void main(String[] args) {
        // 创建一个Person对象，设置年龄
        Person p = new Person();
        p.name = "will";
        p.setAge(-17);
        System.out.println(p.name + "," + p.getAge());
    }
}