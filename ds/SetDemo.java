package ds;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		/**
		 * Set集合的特点：无序（存储和读取的顺序可能不一样），不可重复，没有索引
		 * HashSet存储和遍历
		 * HashSet在添加自定义对象时，会出现重复，原因是add方法会将新添加元素的hash值，地址值和（可重写的）equals方法依次（优先比较不一样直接添加）和已有的所有元素进行比较
		 * 解决方法：重写hashcode方法（使其返回相同的hash值）和equals方法
		 * 三种遍历方式：转数组，迭代器，增强for循环
		 */
/*		Set<String> ss = new HashSet<>();
		ss.add("hello");
		ss.add("hello");
		ss.add("world");
		ss.add("java");
		
		Object[] os = ss.toArray();
		System.out.println(os[0]);
		
		Iterator<String> is = ss.iterator();
		while(is.hasNext()) {
			System.out.println(is.next());
		}
		
		for(String e : ss) {
			System.out.println(e);
		}*/
		
		Set<Student> sss = new HashSet<>();
		Student s1 = new Student();
		s1.name = "tom";
		s1.age = 11;
		Student s2 = new Student();
		s2.name = "thh";
		s2.age = 111;
		Student s3 = new Student();
		s3.name = "thh";
		s3.age = 111;
		sss.add(s1);
		sss.add(s2);
		sss.add(s3);
		Iterator<Student> is = sss.iterator();
		while(is.hasNext()) {
			System.out.println(is.next());
		}
	}
}

class Student{
	String name;
	int age;
	
	@Override
	public int hashCode() {
		int result = 1;
		/**
		 * 我们可以尝试让hashcode的返回值和对象的成员变量相关，进一步优化代码，提高比较效率
		 * 注意，boolean类型不可以参与运算
		 */
		result = age + name.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//判断是否为同一类对象
		if (getClass() != obj.getClass())
			return false;
		//对向下转型
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}
