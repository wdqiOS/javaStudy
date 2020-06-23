/*
import java.util.Arrays;
import ava.util.Set;
import java.util.List;
// 以上代码分别引入了java.util包下的Arrays类、Set类、List类
*/

import java.util.*; // 表示会引入该包下的所有的在当前文件中使用的类

class ImportDemo {
    public static void main(String[] args) {
        int[] arr = {1,6,4,2,3,5};

        // 未使用import之前使用Arrays工具类
        // 打印数组
        String ret = java.util.Arrays.toString(arr);
        System.out.println(ret);

        // 排序
        java.util.Arrays.sort(arr);
        ret = java.util.Arrays.toString(arr);
        System.out.println(ret);

        System.out.println("------------------ 使用import引入后 ----------------");
        arr = new int[]{-1,6,4,-2,3,-5};
        // 使用import引入后
        ret = Arrays.toString(arr);
        System.out.println(ret);

        // 排序
        Arrays.sort(arr);
        ret = Arrays.toString(arr);
        System.out.println(ret);

        Set s;
        List l;
    }
}