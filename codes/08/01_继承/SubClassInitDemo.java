// 动物
/*
    子类初始化过程：创建子类对象的过程
    在创建子类对象之前，会先创建父类对象
    调用子类构造器之前，在子类构造器中会先调用父类的构造器，默认调用的是父类无参数构造器

    1）如果父类不存在可以被子类访问的构造器，则不能存在子类
    2）如果父类没有提供无参数构造器，此时子类必须显示通过super语句去调用父类带参数构造器

    必须先有父类对象

 */
class Animal{
    private String name;
    private int    age;
    Animal(String name, int age) {
        System.out.println("Animal构造器");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

// 鱼
class Fish extends Animal {
    private String color; // 颜色
    Fish(String name, int age, String color) {
        super(name, age); // 调用父类构造器方法，必须放在第一行
        // super(); // 调用父类无参构造器方法，隐式调用
        System.out.println("Fish构造器");
        this.color = color;
    }

    public void say() {
        System.out.println(getName() + "," + getAge() + "," + color);
    }
}


// 子类初始化过程：创建子类对象的过程
class SubClassInitDemo {
    public static void main(String[] args) {
        // 创建鱼对象，创建子类对象之前，会先创建父类对象
        Fish f = new Fish("fish", 1, "蓝色");
        f.say();
    }
}