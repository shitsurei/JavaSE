package packages;

/**
 * 内部类
 * @author 张国荣
 * 成员内部类，局部内部类，匿名内部类
 */
public class InnerClass {
	public static void main(String[] args) {
		/*//内部类的外部创建
		Outer.Inner oi = new Outer().new Inner();
		Outer.Inner2.funin();
		oi.funin();*/
		new Outer2().method();
		new Outer3().method();
	}
}


/**
 * 成员内部类
 * @author 张国荣
 * 1.在外部类的成员位置创建
 * 2.内部类可以直接访问外部类的成员，包括私有成员
 * 3.对其他类而言，需要导入外部类才可以看到内部类
 * 4.对于外部环境而言，内部类只是内部类的一个成员变量
 */
//外部类
class Outer{
	private int i = 10;
	public void funout() {
		Inner i = new Inner();
		i.funin();
	}
	//内部类
	class Inner{
		public void funin() {
			System.out.println("inner class"+i);
		}
	}
	//内部类
	/**
	 * 成员内部类的修饰符
	 * @author 张国荣
	 * 1.使用私有修饰符修饰的成员内部类在其它类中无法访问
	 * 2.用静态修饰符修饰的成员内部类，访问时不用再创建外部类对象
	 */
	static class Inner2{
		public static void funin() {
			System.out.println("inner class2");
		}
	}
}


//局部外部类（作用域仅限于方法内）
class Outer2{
	public void method() {
		class Inner3{
			public void fun() {
				System.out.println("inner class3");
			}
		}
		Inner3 i = new Inner3();
		i.fun();
	}
}

/**
 * 匿名内部类（没有名字的局部内部类，定义在方法当中，必须在定义时创建对象）
 * @author 张国荣
 * 格式：
 * new 类/接口(){
 * 	1.如果是创建了继承这个类的子类对象，我们可以重写父类的方法
 * 	2.如果是创建了实现这个接口的子对象，我们必须要实现该接口的所有方法
 * };
 * 应用场景：
 * 1.作为参数进行传递，且只用一次，减少了java文件数量
 */
class Outer3{
	public void method() {
		/**
		 * 直接当对象使用，一次性
		 */
		new Inner() {
			@Override
			public void func() {
				System.out.println("匿名内部类");
			}
		}.func();
		/**
		 * 用父类变量对其引用
		 */
		Inner i = new Inner() {
			@Override
			public void func() {
				System.out.println("匿名内部类");
			}
		};
		i.func();
	}
}


interface Inner{
	void func();
}