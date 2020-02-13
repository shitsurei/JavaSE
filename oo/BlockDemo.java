package oo;

public class BlockDemo {
	static {
		System.out.println("static with main");
	}
	//未创建BlockDemo对象，以下代码不执行
/*	{
		System.out.println("common construct with main");
	}
	public BlockDemo() {
		System.out.println("comstruct with main");
	}*/
	public static void main(String[] args) {
		System.out.println("main");
		
		//1.局部代码块：存在于方法中，控制变量的生命周期和作用域（节省内存）
		{
			int a = 1;
		}
		//a = 2;	变量a未定义
		new People();
		new People();
		/**
		 * static block,just once
		 * common code in construct method
		 * construct code
		 * common code in construct method
		 * construct code
		 */
	}
}

class People{
	String str;
	int var;
	public People() {
		System.out.println("construct code");
	}
	public People(String str, int var) {
		super();
		this.str = str;
		this.var = var;
	}
	//2.构造代码块：提取构造方法中的共性，每次创建对象都会执行，并在构造方法执行之前执行
	{
		System.out.println("common code in construct method");
	}
	//3.静态代码块：随着类的加载而加载，只执行一次，用于执行初始化操作，如加载驱动
	static {
		System.out.println("static block,just once");
	}
}