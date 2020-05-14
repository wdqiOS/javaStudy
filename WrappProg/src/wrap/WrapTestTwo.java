package wrap;

public class WrapTestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 基本数据类型转换成字符串
		int t1 = 2;
		String t2 = Integer.toString(t1);
		
		// 测试
		System.out.println("int类型转换为String类型对象t2="+t2);
		System.out.println("*******************");
		// 字符串转换为基本数据类型
		// 1.包装类的parse
		int t3 = Integer.parseInt(t2);
		// 2.包装类的valueOf，现将字符串转换为Integer类型对象，再自动转换为int类型
		int t4 = Integer.valueOf(t2);
		// 测试
		System.out.println("String类型对象转换为int类型变量t3="+t3);
		System.out.println("String类型对象转换为int类型变量t4="+t4);
		
		// 练习
		double a = 12.5;
		// 将基本数据类型转换为字符串
		String str1 = String.valueOf(a);
		System.out.println("a转换为String类型后+10="+(str1+10));
		String str = "2.8";
		// 将字符串转换为基本类型
		double b = Double.valueOf(str);
		System.out.println("str 转换为doule类型后+10=" +(b + 10));
	}

}
