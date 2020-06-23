// 方法参数的值传递机制之引用数据类型（值传递）
public class ParameterDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 99};
        printArray(arr);
        swap(arr); // 交换第一个和最后一个元素的值
        printArray(arr);
    }

    // 交换第一个和最后一个元素的值
    static void swap(int[] arr) {
        int temp = arr[0]; // 把第一个元素赋值给temp变量
        arr[0] = arr[arr.length - 1]; // 把最后一个元素赋值给第一个元素
        arr[arr.length - 1] = temp;
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