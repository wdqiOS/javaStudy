// 方法的可变参数
public class VarArgsDemo{
    public static void main(String[] args) {
        // double[] ps = new double[]{10.0, 20.0, 30.0, 40.0, 50.0};
        // double sum = getSum(ps);
        // System.out.println(sum);

        // 方法的可变参数
        double sum = getSum(0.8, 10.0, 20.0, 30.0, 40.0, 50.0);
        System.out.println(sum);
    }
    // 计算商品的总和 可变参数,必须作为参数的最后一个参数，避免歧义;方法最大只有一个可变参数;不会出现空指针错误，调用时会传递new double[]{},空数组
    static double getSum(double cutoff, double ... arr) {
        double sum = 0;
        for (double ele : arr) {
            sum += ele;
        }
        return sum * cutoff;
    }

    /* 
    // 计算商品的总和 不可变参数，注意：会出现空指针错误 double[] num，调用时传递未初始化数组。
    static double getSum(double[] arr){
        double sum = 0.0;
        for(double ele : arr) {
            sum += ele;
        }
        return sum;
    }
    */
}