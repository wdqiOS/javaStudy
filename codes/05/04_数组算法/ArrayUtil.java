// 数组的工具类，涵盖了很多操作数组的方法
class ArrayUtil {
    // 打印数组元素
    static void print(int[] arr) {
        if (arr == null) {
            System.out.println("null");
            return; // 结束方法
        }
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i != arr.length -1) { // 如果当前index不是最后一个索引，则拼接“, ”
                ret += ", ";
            }
            
        }
        ret  = ret + "]";
        System.out.println(ret);

        
    }
    // 逆序排列
    static String[] reverse(String[] oldArr) {

        String[] newArray = new String[oldArr.length]; // 创建一个新的数组，存储颠倒之后的元素
        for (int index = oldArr.length - 1; index >= 0; index--) {
            newArray[oldArr.length - 1 - index] = oldArr[index];
        }
        return newArray;
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

     // 数组元素交换
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // 冒泡排序
    static void sort(int[] arr) {
            // 冒泡排序
            for (int times = 1; times <= arr.length - 1; times++) {
                for (int i = 1; i <= arr.length - times; i++) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i);
                }
            }
        }
    }

    // 选择排序
    static void choiceSort(int[] arr) {
        for (int times = 0; times < arr.length - 1; times++) {
            int minIndex = times;
            for (int j = times + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, times, minIndex);
        }
    }

}