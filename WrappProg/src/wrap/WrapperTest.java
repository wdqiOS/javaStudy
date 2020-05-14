package wrap;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// valueOf: 先去缓存池中寻找-128<参数<127，如果有，直接使用，如果没有则调用new Integer()进行实例化
		Integer one = Integer.valueOf(100);
		Integer two = Integer.valueOf(100);
		System.out.println("one==two的结果："+(one==two));
		
		Integer three = 100; // 自动装箱
		System.out.println("three==100的结果："+(three==100));// 自动拆箱
		
		Integer four = 100;
		System.out.println("three==four的结果:"+(three==four));
		
		Integer five = 200;
		System.out.println("five==200的结果："+(five==200));
		
		Integer six = 200;
		System.out.println("five==six的结果："+(five==six));
		
		
		// 注意：Double、Float包装类不具备缓存池
		Double d1 = Double.valueOf(100);
		System.out.println("d1==100的结果："+(d1==100));
		
		Double d2 = Double.valueOf(100);
		System.out.println("d1==d2的结果："+(d1==d2));
		
		
		// 定义float类型变量，赋值为88.89
		Float f1 = 88.89f;
		// 将基本类型转换为字符串
		String f2 = String.valueOf(f1);
		System.out.println("f1转换为String型后与整数20的求和结果为："+(f2+20));
		// 定义String类型变量，赋值为“188.55”
		String str = "188.55";
		// 将字符串转换为基本数据类型double
		double d = Double.valueOf(str);
		System.out.println("str转换为double型后与整数20的求和结果为："+(d+20));
	}

}
