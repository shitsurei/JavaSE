package ds;

import java.util.*;

public class CollectionDemo {
	public static void main(String[] args) {
		/**
		 * 集合的体系结构：由于不同的数据结构，java为我们提供了不同的集合，但不同的集合功能相似，不断向上提取，将共性抽取出来
		 * 学习从顶层开始，使用从底层开始
		 * ArrayList--List--Collection
		 * 常用方法：add clear contains isEmpty remove size toArray
		 */
		//多态，父类引用指向子类对象，子类实现父类抽象方法
		Collection c = new ArrayList<>();
		//添加方法，允许重复，返回值永远是true
		System.out.println(c.add("hello"));
		System.out.println(c.add("world"));
		System.out.println(c);
		//清空集合
		c.clear();
		//判断集合中是否包含指定元素
		System.out.println(c.contains("hello"));
		//判断集合是否为空
		System.out.println(c.isEmpty());
		//删除元素，成功返回true，失败返回false
		System.out.println(c.remove("hello"));
		//返回集合中的元素个数
		System.out.println(c.size());
		//将集合转换成一个object类型的数组
		Object[] os = c.toArray();
		//返回一个迭代器对象，通过迭代器对象来迭代集合
		Iterator it = c.iterator();
		//hasnext方法用于判断是否还有元素可以获取
		while(it.hasNext()) {
			//next方法用于获取下一个元素，如果没有元素可以获取会报错
			Object o = it.next();
			System.out.println(o);
		}
		
		/**
		 * 迭代器依赖于集合，相当于集合的一个副本，在迭代器操作时，如果发现和集合不一样，则抛出并发修改异常
		 * 解决方案：使用迭代器遍历时使用迭代器本身去修改
		 */
		List l = new ArrayList<>();
		l.add("aaa");
		l.add("bbb");
		l.add("ccc");
		ListIterator li = l.listIterator();
		while(li.hasNext()) {
			if(li.next().equals("aaa")) {
				li.add("ddd");
			}
		}
		System.out.println(l);
	}
}
