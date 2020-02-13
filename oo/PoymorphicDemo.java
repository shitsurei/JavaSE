package oo;

/**
 * 多态的前提
 * @author 张国荣
 * 1.子父类的继承关系
 * 2.方法的重写
 * 3.父类引用指向子类对象
 */
public class PoymorphicDemo {
	public static void main(String[] args) {
		//动态绑定(运行期间)：运行期间调用的方法，是根据其具体的类型而定
		Father s = new Son();//向上转型
		s.eat();
		//s.play(); 无法通过编译
		Son ss = (Son)s;//向下转型
		ss.play();
		System.out.println(s.age);//50
	}
}

/**
 * 多态成员的特点
 * @author 张国荣
 * 成员变量：编译时和运行时看的是左边（成员变量没有重写的概念）
 * 成员动态方法：编译时看左边，运行时看右边（动态绑定）
 * 成员静态方法：编译时和运行时看的是左边（使用变量调用静态方法相当于使用类名调用）
 */
class Father{
	int age = 50;
	public void eat() {
		System.out.println("eat beijing dark");
	}
}

/**
 * 引用类型之间的转换
 * @author 张国荣
 * 向上转型--由小到大（子类转换成父类型）---只能调用父类已有的方法，不能调用子类特有方法
 * 向下转向--由大到小（父类转换成子类型，需要进行强制类型转换）---需要调用子类特有的方法时
 */
class Son extends Father {
	int age = 25;
	@Override
	public void eat() {
		System.out.println("eat KFC");
	}
	public void play() {
		System.out.println("playing lol");
	}
}
