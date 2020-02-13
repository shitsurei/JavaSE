package ds;

import java.util.LinkedList;

public class Link {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("hello");
		l.add("world");
		//在首位添加元素
		l.addFirst("first");
		l.addLast("last");
		System.out.println(l);
		//获取首位元素
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		//删除首位元素
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l);
	}
}
