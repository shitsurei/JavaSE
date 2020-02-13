package oo;

/**
 * this 和 super 的区分
 * @author 张国荣
 * this的作用：
 * 1.当前对象的引用
 * 2.调用子类的成员变量
 * 3.调用子类的成员方法
 * 注意：子类没有时调用的是父类的变量和方法，因为子类已经继承
 * 4.调用子类的其他构造方法（写在构造方法第一句）
 * super的作用：
 * 1.子类对父类的引用
 * 2.调用父类的成员变量
 * 3.调用父类的成员方法
 * 4.调用父类的构造方法（写在子类构造方法的第一句）
 */

public class ExtendDemo {
	public static void main(String[] args) {
		new Dota();
		//moba have param
		//dota no param
	}
}

/**
 * 继承中关键字的使用和就近原则
 * @author 张国荣
 * 在一个类中存在局部变量，成员变量和父类的成员变量重名时，不加任何关键字时采用就近原则
 * 如果想要使用当前类的成员变量或父类的成员变量，可以使用关键字this和super
 */
class MOBA{
	public String name = "lol";
	public String version = "1.24e";
	//父类的私有成员变量对子类不可见
	private int num;
	public MOBA() {
		System.out.println("moba no param");
	}
	public MOBA(int param) {
		System.out.println("moba have param");
	}
	public void update() {
		System.out.println(name+" has updated, now version is "+version);
	}
}

/**
 * 继承中构造方法的执行顺序
 * @author 张国荣
 * 创建子类的对象，调用子类的构造方法，如果子类的构造方法第一行代码，没有调用父类的构造方法，则会默认调用父类的无参构造
 * 除非在子类构造方法的第一行使用super关键字调用父类有参构造方法
 */

class Dota extends MOBA {
	//子类和父类成员变量相同时获取子类的成员变量（就近原则），不同时获取父类的成员变量
	//如果非要使用父类成员变量，可以使用super关键字
	public String name = "dota";
	public Dota() {
		super(1);
		System.out.println("dota no param");
	}
	public Dota(int param) {
		System.out.println("dota have param");
	}
	//方法重写，同理采用就近原则
	/**
	 * 注意事项：
	 * 1.子类不能重写父类的私有方法
	 * 2.子类的重写方法的权限必须大于等于父类
	 */
	@Override	//这个注解表明该方法是重写父类的方法
	public void update() {
		System.out.println(name+" has updated, now version is "+version);
	}
}
