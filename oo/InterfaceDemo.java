package oo;
/**
 * @author 张国荣
 * 接口的优点
 * 1.打破继承的局限性
 * 2.对外提供规则
 * 3.降低程序的耦合性（实现模块化开发）
 * 和抽象类的区别
 * 1. 接口没有构造方法
 * 2. 接口只能有常量
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		System.out.println(d.speak());
		d.live();
	}
}

/**
 * 
 * @author 张国荣
 * 1.接口中方法默认的修饰符为 public abstract，且只能使用它，因此可以省略
 * 2.接口中属性默认的修饰符为 public static final，因此只能有常量，且可以用接口直接访问
 */
interface Life{
	void live();
}

interface Animals extends Life {
	int num = 1;
	void eat();
	String speak();
}

/**
 * 类与接口之间的关系
 * @author 张国荣
 * 类和类：单一继承关系，多层继承
 * 类和接口：多实现
 * 接口与接口：多继承，实现接口时需要实现所有层次的抽象方法
 */
class Dog implements Animals {
	@Override
	public void eat() {
		System.out.println("eat bones");
	}
	@Override
	public String speak() {
		return "barking";
	}
	@Override
	public void live() {
		System.out.println("it's alive");
	}
}
