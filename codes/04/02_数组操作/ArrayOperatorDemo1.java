// 数组的基本操作
class ArrayOperatorDemo1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 7, 9};
        // 数组的长度
        System.out.println("数组的长度:" + nums.length); // 数组的长度
        // 获取元素：元素类型 变量 = 数组名[index];
        System.out.println("数组的第一个元素:" + nums[0]);
        System.out.println("数组的最后一个元素:" + nums[nums.length - 1]);
        // 设置元素：数组名[index] = 值;
        nums[0] = 100; // 修改nums数组的第一个元素
        System.out.println("数组的第一个元素:" + nums[0]);
        // 遍历数组的元素
        System.out.println("--------------------------");
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println("--------------------------");
        // 遍历数组元素
        for (int index = 0; index < nums.length; index++) {
            System.out.println(nums[index]);
        }

        System.out.println("--------------------------");
        boolean[] bs = new boolean[3];
        for (int i = 0; i < bs.length; i++) {
            System.out.println(bs[i]);
        }

        System.out.println("--------------------------");
        double[] ds = new double[3];
        for (int i = 0; i < ds.length; i++) {
            System.out.println(ds[i]);
        }

        System.out.println("--------------------------");
        long[] ls = new long[3];
        for (int i = 0; i < ls.length; i++) {
            System.out.println(ls[i]);
        }
        System.out.println("--------------------------");
        char[] cs = new char[3];
        for (int i = 0; i < cs.length; i++) {
            System.out.println(cs[i]);
        }

        /*
            NullPointerException: 空指针异常(空引用)；当数组还未初始化，就直接操作数组。
            ArrayIndexOutOfBoundsException: 数组的索引越界异常
         */
        bs = null;
        // System.out.println(bs.length); // Exception in thread "main" java.lang.NullPointerException
        // System.out.println(nums[-1]);  // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1

    }
}