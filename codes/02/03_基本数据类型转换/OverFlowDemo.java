/*
    当腰表示的数据超出数据类型的临界范围时，称为溢出。溢出情况发生时，程序并没有做数据范围检查处理。此时会
 */
class OverFlowDemo {
    public static void main(String[] args) {
        // int类型最大的值:2147483647
        // int intMax = 2147483648; // 错误: 过大的整数: 2147483648
        int intMax = 2147483647;
        intMax = intMax + 1;
        System.out.println("int最大值："+intMax); // int最大值：-2147483648
        /*
            0b01111111_11111111_11111111_11111111
          + 0b00000000_00000000_00000000_00000001
        -------------------------------------------
            0b10000000_00000000_00000000_00000000
         */

        int intMin = -2147483648;
        intMin = intMin - 1;
        System.out.println(intMin);
    }
}