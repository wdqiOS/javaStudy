// 死循环和循环语句对比
class LoopDemo {
    public static void main(String[] args) {
        /*
        // while死循环
        while(true) {
            System.out.println("帅哥！");
        }
        // do while死循环
        do {
            System.out.println("帅哥！");
        } while(true);
        // for死循环
        for (; ; ) {
            System.out.println("帅哥！");
        }
        */
       /*
       for (System.out.println("初始化"); ; System.out.println("循环之后")) {
           System.out.println("循环体");
       }
       */
      
          // 打印1~5
          System.out.println("----------- while循环 ---------------");
          // while
          int count = 1;
          while(count <= 5) {
            System.out.println(count);
            count ++;
          }
          
         System.out.println("----------- for循环 ---------------");
          // for
          count = 1;
          for (; count <= 5; count ++) {
            System.out.println(count);
          }
     }
}