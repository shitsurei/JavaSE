package oo;

/**
 * final修饰符，可以用于修饰类，成员变量和成员方法
 * @author 张国荣
 * 所修饰的类：不能被继承，不能有子类
 * 所修饰的方法：不能被子类重写
 * 所修饰的变量：一旦初始化之后不能被修改，即自定义常量，一般变量名使用全大写和_连接
 */
public class FinalDemo {
	public static void main(String[] args) {
		final int A = 11;
		//A = 12;	报错
	}
}
