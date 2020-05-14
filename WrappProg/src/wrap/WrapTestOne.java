package wrap;

public class WrapTestOne {
	public static void main(String[] args) {
		// 装箱：把基本数据类型转换成包装类
		// 1. 自动装箱
		int t1 = 2;
		Integer t2 = t1;
		// 2. 手动装箱
		Integer t3 = Integer.valueOf(t1);
		
		// 测试
		System.out.println("int类型变量t1="+t1);
		System.out.println("Integer类型对象t2="+t2);
		System.out.println("Integer类型对象t3="+t3);
		System.out.println("============================");
		// 拆箱：把包装类转换成基本数据类型
		// 1. 自动拆箱
		int t4 = t2;
		// 2. 手动拆箱
		int t5 = t2.intValue();
		
		// 测试
		System.out.println("Integer类型对象t2="+t2);
		System.out.println("自动拆箱后，int类型变量t4="+t4);
		System.out.println("手动拆箱后，int类型变量t5="+t5);
		
		double t6 = t2.doubleValue();
		System.out.println("手动拆箱后，double类型变量t6="+t6);
		
		float t7 = t2.floatValue();
		System.out.println("手动拆箱后，float类型变量t7="+t7);
		
		System.out.println("============================");
		// 练习
		// 定义int类型变量，值为100
		int score = 100;
		// 创建Integer包装类对象，表示变量score1
		Integer score1 = Integer.valueOf(score);
		
		// 将Integer包装类转换为double类型
		double score2 = score1.doubleValue();
		
		// 将Integer包装类转换成long类型
		long score3 = score1.longValue();
		
		// 将Integer包装类转化为int类型
		int score4 = score1;
		int score5 = score1.intValue();
		
		System.out.println("score对应的Integer类型结果为："+score1);
		System.out.println("score对应的double类型结果为："+score2);
		System.out.println("score对应的long类型结果为："+score3);
		System.out.println("重新由Integer转换为int类型结果为："+score4);
		System.out.println("重新由Integer转换为int类型结果为："+score5);
		
	}
}
