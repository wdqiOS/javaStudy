// 单例：饿汉式
class ArrayUtil {
    // 1) 必须在该类中，自己先创建出一个对象
    private static final ArrayUtil instance = new ArrayUtil();
    // 2) 私有化构造器，防止外界通过构造器创建新的对象
    private ArrayUtil() {}
    // 3）向外暴露一个公共的静态方法用于获取自身的对象
    public static ArrayUtil getInstance() {
        return instance;
    }

    public void sort(int[] arr) {
        System.out.println("排序操作");
    }

}
// 单例
class SingletonDemo {
    public static void main(String[] args) {
        // new ArrayUtil().sort(null);
        // new ArrayUtil().sort(null);
        // new ArrayUtil().sort(null);
        // 单例模式
        ArrayUtil.getInstance().sort(null);
        ArrayUtil.getInstance().sort(null);
        ArrayUtil.getInstance().sort(null);
        ArrayUtil.getInstance().sort(null);
    }
}