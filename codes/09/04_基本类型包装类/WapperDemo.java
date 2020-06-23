// 包装类的操作
class WapperDemo {
    public static void main(String[] args) {
        // 包装类中的常量
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Double.SIZE);
        System.out.println(Integer.TYPE);
        // 包装类中的构造器:xxx类型的包装类xxx(xxx表示8大基本数据类型)
        // xxx(xxx value): 接受自己的基本类型值，如Integer(int val) / Boolean(boolean val)
        // xxx(String value):但是，Character除外
        // 构造器的作用：创建包装类对象
        // 基本类型和包装类型的转换（装箱和拆箱）
        /*
            装箱：
                Integer i1 = new Integer(1);
                Integer i2 = Integer.valueOf(1); // valueOf()带有缓存
            拆箱：
                int i3 = i1.intValue();
         */
        // Byte、Short、Int、Long、Float、Double继承在Number，类型之间可以互相转换
        Long i1 = 12L;
        byte b1 = i1.byteValue(); // Long -> byte
        int i = i1.intValue(); // Long -> int
        double d = i1.doubleValue(); // Long -> double
        System.out.println(b1);

        // String和基本类型/包装类型之间的转换
        /*
        
            把String类型转换为包装类的对象
            方式1：static xxx valueOf(String str);
                Integer i1 = Integer.valueOf("123");
            方式2：new xxx(String str);
                Integer i2 = new Integer("123");

            把基本数据类型转换成String
            String str = 17 + "";

            把包装类对象转换成String
            String str = 任何对象.toString();

            把String转换为基本数据类型
            String input = "123456";
            int num = Integer.parseInt(input);
         */

        System.out.println(new Boolean("SB"));
        System.out.println(new Boolean("true"));

        Integer num2 = null;
        System.out.println(num2);
        num2 = 0;
        System.out.println(num2);
        System.out.println(Integer.toBinaryString(9999));
        System.out.println(Integer.toOctalString(9999));
        System.out.println(Integer.toHexString(9999));
        
    }
}