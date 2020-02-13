package collection;
/**
 * 对象数组的内存模型
 * @author 张国荣
 *
 */
public class ClassArray {
	public static void main(String[] args) {
		//堆中生成数组对象new Student[3]，数组的初始值均为null，其地址保存在栈中变量ss对应的值下
		Student[] ss = new Student[3];
		//对中生成对象new Student，初始值为（null，0），同时保存着方法区类模板的构造方法等函数地址
		Student s1 = new Student("tom", 22);
		//该对象的地址保存在栈中变量s1，s2，s3处
		Student s2 = new Student("john", 32);
		//三个字符串常量保存在方法区的常量池中，调用有参数的构造方法时在栈中开辟空间，修改堆中相应对象的初始值，完成后收回栈空间
		Student s3 = new Student("jan", 12);
		//用对象数组的索引赋值，数组中保存着堆中三个学生对象的地址，即栈中变量s1s2s3所对应的值
		ss[0] = s1;
		ss[1] = s2;
		ss[2] = s3;
		for(Student e : ss) {
			//如果没有重新Student的tostring方法，打印出三个学生对象的地址值
			System.out.println(e);
		}
	}
}

/**
 * 学生类
 * @author 张国荣
 * 模板存储在方法区中
 */
class Student{
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
