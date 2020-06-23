import java.util.Arrays;

import static java.util.Arrays.sort; // 把java.util.Arrays类中的静态方法sort导入到StaticImportDemo类中
import static java.util.Arrays.binarySearch; // 把java.util.Arrays类中的静态方法binarySearch导入到StaticImportDemo类中
import static java.util.Arrays.*; // 此时的*表示当前类的任意使用到的静态成员

// 静态导入
class StaticImportDemo {
    public static void main(String[] args) {

        int[] arr = new int[]{-1,6,4,-2,3,-5};
        String ret = Arrays.toString(arr);
        System.out.println(ret);
        // 排序
        // Arrays.sort(arr);
        sort(arr);

        ret = Arrays.toString(arr);
        System.out.println(ret);

        int index = binarySearch(arr, 6);
        System.out.println(index);
    }
}