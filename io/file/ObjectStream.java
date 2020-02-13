package io.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 	对象操作流：可以用于读写任意类型的对象
 * 	1.使用对象输出流写出对象的同时只能使用对象输入流来读取对象
 * 	2.只能将支持序列化接口的对象写入流中
 * 	3.写出的对象会有乱码，只能用对象输入流读取查看
 * 	ObjectOutputStream(OutputStream out)
 * 	ObjectInputStream(InputStream in)
 * @author 张国荣
 *
 */
public class ObjectStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//ArrayList已实现了序列化接口，可以直接进行对象写入
		List<Student> ls = new ArrayList<>();
		Student s1 = new Student("John", 12);
		Student s2 = new Student("dim", 22);
		ls.add(s1);
		ls.add(s2);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/worktest/a.txt",false));
		oos.writeObject(ls);
		oos.close();
		
		//文件输入流读到末尾会抛异常,可以用捕获异常的方式进行处理
		//也可以采用集合类保存多个对象,读取时只读取一次集合对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/worktest/a.txt"));
		Student s;
		try {
			while(true) {
				s = (Student) ois.readObject();
				System.out.println(s);
			}
		} catch (EOFException e) {
			ois.close();
		}
		ls = new ArrayList<>();
		ls = (List<Student>) ois.readObject();
		for(Student e : ls) {
			System.out.println(e);
		}
		ois.close();
	}
}

class Student implements Serializable{
	/**
	 * 	序列化接口，是一个标识接口，只起标识作用，没有方法
	 * 	当一个类需要的对象需要IO流进行读写的时候，这个类必须实现该接口
	 * 	注意：当对象已经存入文件后，如果对类的成员结构进行修改，就会改变类的序列号，在读取文件时造成类的序列号与对象不匹配，产生InvalidClassException异常
	 * 	可以通过生成固定序列号解决，此时再读入时缺少成员变量值时会给出默认值（0，null，false等）
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}