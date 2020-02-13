package oo;

/**
 * 抽象类和抽象方法
 * @author 张国荣
 * 1.有抽象的方法的类必须是抽象类，用abstract修饰
 * 2.继承抽象类的子类必须重写所有抽象方法，除非他自己也是抽象类
 * 3.抽象类不能实例化，但可以有构造方法（对成员变量进行初始化）
 * 4.final修饰的方法不能被重写，类不能被继承故和abstract冲突
 * 5.private修饰的方法在子类中不可见，故也 与abstract冲突
 * 用于制定规范
 * jdk中的Writer和Reader均为抽象类
 */
public class AbstractDemo {
	public static void main(String[] args) {
		new Cat().eat();
	}
}


abstract class Animal{
	public abstract void eat();
}

class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println("eat fish");
	}
}
