package wrap;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 实例化对象
		Cat one = new Cat();
		// 测试输出
		System.out.println("小猫的昵称："+one.name);
		System.out.println("小猫的年龄："+one.month);
		System.out.println("小猫的体重："+one.weight);
		
		test();
		
		
	}
	
	public static void test() {
		Integer one = Integer.valueOf(100);
		Integer two = Integer.valueOf(100);
		System.out.println("one==tow的结果："+ (one==two));
		
		Integer three = 100;
		System.out.println("three==100的结果："+(three == 100));
		
		Integer four = 100;
		System.out.println("three==four的结果："+(three==four));
		
		Integer five = 200;
		System.out.println("five==200的结果："+(five==200));
		
		Integer six = 200;
		System.out.println("five==six的结果："+(five==six));
		
	}

}
