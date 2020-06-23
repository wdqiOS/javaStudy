// 二分搜索法/二分查找法/折半查找
class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = binarySearch(arr, 8);
        System.out.println(index);
    }

    // 从arr数组中搜索key的元素，找到返回其索引，否则返回-1
    static int binarySearch(int[] arr, int key) {
        int low = 0; // 最小的索引
        int high = arr.length - 1; // 最大的索引

        while(low <= high) {
            int mid = (low + high) >> 1; // 中间索引等价于(low + high)/2
            int midVal = arr[mid]; // 中间的元素
            if(midVal > key) { // 猜大了
                high = mid - 1;
            } else if(midVal < key) { // 猜小了
                low = mid + 1;

            } else {
                return mid;
            }
            System.out.println("-----------------" + low  + "\t"+ high);
        }

        return -1;
    }
}