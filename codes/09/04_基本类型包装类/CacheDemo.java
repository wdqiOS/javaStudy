// 包装类中的缓存设计
class CacheDemo {
    public static void main(String[] args) {
        Integer i1 = new Integer(123);
        Integer i2 = new Integer(123);
        System.out.println(i1 == i2); // false

        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf(123);
        System.out.println(i3 == i4); // true

        Integer i5 = 123;
        Integer i6 = 123;
        System.out.println(i5 == i6); // true
        // 缓存空间[-128, 127],
        // == 引用类型比较的是地址比较
        // equals:引用类型比较的也是地址，官方建议重写equals方法，比较关心的数据。包装基本数据类型，使用equals比较

        System.out.println("-------------------------------");
        Integer i11 = new Integer(250);
        Integer i21 = new Integer(250);
        System.out.println(i11 == i21); // false

        Integer i31 = Integer.valueOf(250);
        Integer i41 = Integer.valueOf(250);
        System.out.println(i31 == i41); // false

        Integer i51 = 250;
        Integer i61 = 250;
        System.out.println(i51 == i61); // false

        
    }
}