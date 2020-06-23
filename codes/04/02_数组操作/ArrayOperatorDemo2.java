// 获取数组最大最小元素
class ArrayOperatorDemo2 {
    // 获取数组最大元素
    static int getMax(int[] nums) {
        int max = nums[0]; // 假设第一个元素为最大值
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    // 获取数组中最小元素
    static int getMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{10, -3, 5, 0, 2, 1};
        int max = ArrayOperatorDemo2.getMax(nums);
        System.out.println("最大元素为：" + max);
        int min = ArrayOperatorDemo2.getMin(nums);
        System.out.println("最小元素为：" + min);

        System.out.println("============================");
        String[] arr = {"A", "B", "C", "D", "E"};
        ArrayOperatorDemo2.printArray(arr);
        System.out.println("============================");
        // 逆序排列数组
        String[] reverseArray = ArrayOperatorDemo2.reverse(arr);
        System.out.println("逆序排列后的元素为：");
        ArrayOperatorDemo2.printArray(reverseArray);
    }

    // 打印数组元素
    static void printArray(String[] arr) {
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

}