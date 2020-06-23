// 嵌套循环:如果一个重复的操作需要做N次，可以使用嵌套循环，可以把内层循环看成是一个整体。
class LoopInLoopDemo {
    public static void main(String[] args) {
        /*
        for (int i = 0; i < 100; i++) {
            System.out.println("i=" + i);
        }
        System.out.println("----------- 老唐 ------------");
        for (int i = 0; i < 100; i++) {
            System.out.println("i=" + i);
        }
        System.out.println("------------ 猴哥 ------------");
        for (int i = 0; i < 100; i++) {
            System.out.println("i=" + i);
        }
        System.out.println("------------- 二师兄 -----------");
        for (int i = 0; i < 100; i++) {
            System.out.println("i=" + i);
        }
        System.out.println("------------- 老沙 -----------");
        */
       for (int count = 1; count <= 4; count++) {
           for (int i = 0; i < 100; i++) {
                System.out.println("i=" + i);
            }
            System.out.println("---------------------------");
       }
    }
}