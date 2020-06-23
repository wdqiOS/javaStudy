/* 
    数组初始化
    语法：
    数组元素类型[] 数组名 = new 数组元素类型[]{元素1,元素2,元素3,...};
    简单写法：必须声明之后，立刻初始化，不能先声明后再初始化。
    数组元素类型[] 数组名 = {元素1,元素2,元素3,...};
*/
public class ArrayInitDemo1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 7, 9};
        System.out.println(nums.length); // 数组的长度，数组中有几个元素

        nums = new int[]{2, 4,8};
        System.out.println(nums.length);
    }
}