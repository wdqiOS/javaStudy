class RectangelDemo {
    public static void main(String[] args) {
        /*
        // SB版本
        
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        */
       /*
       for (int i = 1; i <= 5; i++) {
           System.out.print("*");
       }
       System.out.println(); // 换行
       for (int i = 1; i <= 5; i++) {
           System.out.print("*");
       }
       System.out.println();
       for (int i = 1; i <= 5; i++) {
           System.out.print("*");
       }
       System.out.println();
       */
       for (int line = 0; line < 3; line++) {
           for (int j = 0; j < 5; j++) {
               System.out.print("*");
           }
           System.out.println(); // 换行
       }

    }
}