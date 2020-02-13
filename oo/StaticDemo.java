package oo;
/**
 * 静态变量和方法用于创建工具类，不用创建对象，节省堆内存
 * 例如Math类，直接将构造方法私有，即不允许创建对象
 * PI
 * abs，ceil，floor，round，max，min，pow（底数，指数），random返回值【0,1）
 * @author 张国荣
 *
 */
public class StaticDemo {
	public static void main(String[] args) {
		Student s1 = new Student("hh", 11);
		Student s2 = new Student("gg", 12);
		System.out.println(s1);
		System.out.println(s2);
		Student.graduate();
	}
}

class Student{
	String name;
	int age;
	//static修饰的静态变量： 1.可以被所有对象共享  2.可以使用类名调用  3.静态的加载随着类的加载而加载，优先于对象
	static String graduate = "JLUXZ";
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//static修饰的静态方法： 1.可以调用静态成员变量，也可以调用静态成员方法	2.可以直接用类名调用，不建立对象
	public static void graduate() {
		System.out.println("i am graduated from "+graduate);
	}

	@Override
	public String toString() {
		return name + "--" + age + "--" + graduate;
	}
	
}
