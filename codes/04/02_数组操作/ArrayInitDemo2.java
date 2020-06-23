// 数组的动态初始化：由我们来设置数组的元素个数（数组长度），而每一个数组元素的初始值有系统决定。

public class ArrayInitDemo2 {
    public static void main(String[] args) {
        int[] nums = new int[3];
        System.out.println(nums.length); // 数组的长度

        nums = new int[6];
        System.out.println(nums.length);
        nums = null; // 此时nums没有引用任何内存空间
        // System.out.println(nums.length); // java.lang.NullPointerException
       
    }
}