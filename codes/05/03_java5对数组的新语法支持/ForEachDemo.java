// 
public class ForEachDemo {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        forPrintArray(nums); // 引用传递
        System.out.println("============ java5增强for循环 ============");
        // java5增强for循环，foreach其实在底层依然是使用for循环+索引来操作数组的，我们把增强for循环称之为编译器的新特性--->语法糖
        // for循环功能比foreach更彪悍，如果迭代数组元素，不关心数组的索引的时候，首选使用foreach
        for (int ele : nums) {
            System.out.println(ele);
        }

    }

    // 使用循环迭代出数组中的每一个元素
    static void forPrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
