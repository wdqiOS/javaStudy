
// 描述学生对象
class Student {
    String name; // 学生名称
    boolean isFee = false; // 学生缴费状态，默认是未缴费

    void fees() {
        isFee = true; // 设置为已缴费
    }

    // 构造器
    // Student(String name, boolean isFee) {
    //     this.name = name;
    //     this.isFee = isFee;
    // }

    @Override
    public String toString() {
        return "name=" + name + ", isFee:" + isFee;
    }
}

// 测试类
class StudentDemo {
    public static void main(String[] args) {
        // 创建4个学生对象
        Student s1 = new Student();
        s1.name = "赵云";
        s1.isFee = false;

        Student s2 = new Student();
        s2.name = "刘备";

        Student s3 = new Student();
        s3.name = "关羽";

        Student s4 = new Student();
        s4.name = "张飞";
        s4.isFee = true;

        // 创建一个数组，用于存储所有的学生对象
        Student[] arr = new Student[]{s1, s2, s3, s4};
        
        // 循环迭代数组中的每一个元素
        for (Student ele : arr) {
            // 判断当前学生对象是否缴费，如果没有，则调用缴费方法
            if(!ele.isFee) {
                ele.fees();
            }
        }

        for (Student ele : arr) {
            System.out.println(ele);
        }



    }
}