package api;

/**
 * 包装类和自动拆装箱
 * @author 张国荣
 * 由于基本数据类型只能做一些简单的计算，所以java为每种基本数据类型提供包装类
 * 以int为例
 */
public class PackageClass {
	public static void main(String[] args) {
		/**
		 * 构造方法
		 * 1. 传int
		 * 2. 传String
		 */
		Integer i = new Integer(33);
		i = new Integer("33");
		//范围常量
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		/**
		 * 与字符串之间的转换
		 * 1. 加空串
		 * 2. 动态方法
		 * 3. 静态方法
		 */
		int a = 5;
		String aa = a + "";
		aa = i.toString();
		aa = Integer.toString(a);
		a = Integer.parseInt(aa);
		
		//自动装箱
		Integer i2 = 3;
		//自动拆箱
		int i3 = i2;
		Integer i4 = 5;
		/**
		 * 自动拆装箱
		 * Integer i5 = new Integer(i2.intValue()+i3.intValue());
		 * 应用场景：集合中存放基本数据类型
		 */
		Integer i5 = i2 + i3;
	}
}
