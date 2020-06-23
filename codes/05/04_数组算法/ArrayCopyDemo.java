// 数组元素拷贝
class ArrayCopyDemo {
    public static void main(String[] args) {
        int[] src = new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10}; // 源数组
        int[] dest = new int[10]; // 目标数组
        // 将src数组中拷贝3、4、5、6元素到dest数组中
        printArray(dest);
        // copy(src, 2, dest, 5, 4); // 拷贝操作
        // 直接使用系统的拷贝方法
        System.arraycopy(src, 2, dest, 5, 4);
        printArray(dest);
    }

    
    /**
     * 将源数组src从第srcPos位置开始拷贝到目标数组dest从destPos位置开始粘贴length个元素
     * @param src     源数组
     * @param srcPos  从源数组中哪一个索引位置开始拷贝
     * @param dest    目标数组
     * @param destPos 在目标数组中哪一个索引位置开始粘贴
     * @param length  拷贝元素的个数
     */
    // 存在的问题：1）只能拷贝int类型的数组；2）代码不够强壮
    static void copy(int[] src, int srcPos, int[] dest, int destPos, int length) {
        if (src == null || dest == null) {
            System.out.println("数组不能为null");
            return ;
        }

        if(srcPos < 0 || destPos < 0 || length < 0 || (srcPos + length) > src.length || (destPos + length) > dest.length){
            System.out.println("参数格式不正确！");
            return;
        }

        // 拷贝
        dest[destPos] = src[srcPos];
        for (int i = srcPos; i < srcPos + length; i++) {
            dest[destPos] = src[i];
            destPos++;
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