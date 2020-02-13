package ds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Generic {
	public static void main(String[] args) {
		/**
		 * 由于集合可以存储任意类型的对象，当我们存储了不同类型的对象，就可能在转换的时候出现类型转换异常，为了解决这个问题java提供了泛型
		 * 泛型是一种广泛的类型，把明确数据类型的工作提前到了编译时期，借鉴了数组的特点
		 */
		Collection<String> cs = new ArrayList<>();
		cs.add("hello");
		cs.add("world");
		Iterator<String> is = cs.iterator();
		while(is.hasNext()) {
			System.out.println(is.next());
		}
		/**
		 * 实现Iterable接口的类可以使用foreach遍历
		 * 在增强for循环中不能修改集合，否则会出现并发修改异常
		 */
	}
}
