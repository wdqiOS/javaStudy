// 元素出现索引（第一次/最后一次）线性搜索
class ArraySearchDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 50, -30, 10};
        int beginIndex = ArraySearchDemo.indexOf(arr, 10);
        System.out.println(beginIndex);

        System.out.println("=======================");
        int lastIndex = ArraySearchDemo.lastIndexOf(arr, 10);
        System.out.println(lastIndex);
    }

    /**
     *  查询key元素在arr数组中第一次出现的位置
     * @param  arr 从哪一个数组中去查询
     * @param  key 当前去查询的元素
     * @return      如果key存在于arr数组中，则返回第一次出现的索引
                    key不存在于arr数组中，返回-1
     */
    static int indexOf(int[] arr, int key) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == key) {
                return index;
            }
        }
        return - 1;
    }
    /**
     * 查询key元素在arr数组中最后一次出现的位置
     * @param  arr 从哪一个数组中去查询
     * @param  key 当前去查询的元素
     * @return     如果key存在于arr数组中，则返回最后一次出现的索引
     *             key不存在于arr数组中，返回-1
     */
    static int lastIndexOf(int[] arr, int key) {
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}