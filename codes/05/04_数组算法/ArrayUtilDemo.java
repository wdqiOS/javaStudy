class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 2, 0, 9, 6,-3};
        ArrayUtil.print(arr); // 打印数组
        ArrayUtil.sort(arr);
        ArrayUtil.print(arr);
        // 搜索6的索引
        int index = ArrayUtil.binarySearch(arr, 6);
        System.out.println(index);
    }
}