public class StepInVarDemo {
    public static void main(String[] args) {

        int x = 6;
        int y = 3;

        // 接到客户的一个需求，求两个操作数6和3的和，差，积，商。
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        // 开发中唯一变化的是需求一直在变
        // 需求变化：把操作数改成8和4
        x = 8;
        y = 4;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
    }
}