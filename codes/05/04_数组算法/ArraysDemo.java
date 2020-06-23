// 演示数组的工具类：Arrays类

class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 4, 2, 0, 9, 6,-3};
 
        String ret = java.util.Arrays.toString(arr); // 打印
        System.out.println(ret);

        System.out.println("============ 排序==========");
        java.util.Arrays.sort(arr); // 排序
        System.out.println(java.util.Arrays.toString(arr));

        System.out.println("============ 排指定索引 ==========");
        arr = new int[]{1, 3, 7, 4, 2, 0, 9, 6,-3};
        System.out.println(java.util.Arrays.toString(arr));
        java.util.Arrays.sort(arr, 2, 6); // 排序,前闭后开，包含2不包含6
        System.out.println(java.util.Arrays.toString(arr));

        System.out.println("============ 查找指定元素的索引 ==========");
        arr = new int[]{1, 3, 7, 4, 2, 0, 9, 6, -3};
        java.util.Arrays.sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
        int index = java.util.Arrays.binarySearch(arr, 6); // 使用二分法查找指定元素的索引，必须先排序
        System.out.println(index);
        System.out.println(arr.length);

    }
}