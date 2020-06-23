// 数组的排序操作
class ArraySortDemo {
    public static void main(String[] args) {
        int[] arr = {2, 9, 6, 7, 4, 1, 3, 0};
        printArray(arr); // 排序前

        // bubbleSort(arr); // 冒泡排序
        choiceSort(arr); // 选择排序
        printArray(arr); // 排序后
    }
    // 数组元素交换
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // 冒泡排序
    static void bubbleSort(int[] arr) {
        /*
        // 第1轮
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i - 1] > arr[i]) {
                swap(arr, i - 1, i);
            }
        }
        // 第2轮
        for (int i = 1; i <= arr.length - 2; i++) {
            if (arr[i - 1] > arr[i]) {
                swap(arr, i - 1, i);
            }
        }
        // 第3轮
        for (int i = 1; i <= arr.length - 3; i++) {
            if (arr[i - 1] > arr[i]) {
                swap(arr, i - 1, i);
            }
        }
        */
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
        /*
        // 第1轮
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[0] > arr[i]) {
                swap(arr, 0, i);
            }
        }
        // 第2轮
        for (int i = 2; i <= arr.length - 1; i++) {
            if (arr[1] > arr[i]) {
                swap(arr, 1, i);
            }
        }
        // 第3轮
        for (int i = 3; i <= arr.length - 1; i++) {
            if (arr[2] > arr[i]) {
                swap(arr, 2, i);
            }
        }
     */
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

     // 打印数组元素
    static void printArray(int[] arr) {
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
}