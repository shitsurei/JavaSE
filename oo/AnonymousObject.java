package oo;

/**
 * 匿名对象
 * @author 张国荣
 * 当方法只调用一次时可以使用
 * 其赋值没有意义
 * 可以作为参数传递
 */
public class AnonymousObject {
	public static void main(String[] args) {
		new Student("tom", 12).graduate();
	}
}
