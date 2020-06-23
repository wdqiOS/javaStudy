
// 演示Object类中的方法
class ObjectDemo {
    public static void main(String[] args) {
        String str1 = new String("AA");
        String str2 = new String("AA");
        // hashCode
        System.out.println(str1.hashCode());

        
        // 在Object类中的equals方法，本身和==符号相同，都是比较对象的内存地址.官方建议：每个类都应该覆盖equals方法，不要比较内存地址，而去比较我们关心的数据。例如：两个字符串，只要内容相同，我们就认为是同一个字符串
        System.out.println(str1.equals(str2));

        // String toString(); // 表示把一个对象转换为字符串
        Object obj = new Object();
        System.out.println(obj);
        System.out.println(obj.toString());

        User u = new User("lizhe", 20);
        System.out.println(u);
    }

}

class User {
    private String name;
    private int    age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "," + age;
    }

}