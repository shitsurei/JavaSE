package packages;
/**
 * 权限修饰符的可访问性
 * @author 张国荣
 * public		当前类	相同包下不同类	子类	不同包下的类（需要先导包）
 * protected	当前类	相同包下不同类	子类
 * default		当前类	相同包下不同类	
 * private		当前类	
 */
public class PermissionDemo {
	public static void main(String[] args) {
/*		PermissionDemo pd = new PermissionDemo();
		pd.method1();
		pd.method2();
		pd.method3();
		pd.method4();*/
		PermissionSon ps = new PermissionSon();
		ps.method1();
		ps.method2();
		ps.method3();
	}
	public void method1() {
		System.out.println("public");
	}
	void method2() {
		System.out.println("default");
	}
	protected void method3() {
		System.out.println("protected");
	}
	private void method4() {		
		System.out.println("private");
	}
}

/**
 * 修饰符使用规范
 * @author 张国荣
 * 1.使用public修饰类
 * 2.一个java文件只能有一个类
 * 3.如果一个文件中有多个类，类名和文件名一样的类用public修饰，其他的不能用
 * 4.所有的成员变量都用private来修饰
 * 5.方法可以根据使用者进行限制
 * 6.不想被创建对象时构造方法用private修饰
 */
class PermissionSon extends PermissionDemo {
	
}
