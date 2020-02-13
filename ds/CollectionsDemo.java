package ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		/**
		 * Collection是集合体系的最顶层，包含了集合体系的共性，分为List和Set两大类
		 * Collections是一个工具类 ，方法用于操作Collection
		 */
		//二分查找查询指定元素在指定列表的索引位置，要求列表有序
		List<String> ls = new ArrayList<>();
		ls.add("aaa");
		ls.add("bbb");
		ls.add("ccc");
		ls.add("ddd");
		ls.add("eee");
		ls.add("fff");
		int index = Collections.binarySearch(ls, "ccc");
		System.out.println(index);
		/*
		List<String> ls2 = new ArrayList<>();
		ls2.add("");
		ls2.add("");
		ls2.add("");
		ls2.add("");
		ls2.add("");
		ls2.add("");
		ls2.add("");
		ls2.add("");
		//把源列表中的数据覆盖到目标列表中，要求目标列表的长度大于等于源列表
		Collections.copy(ls2, ls);
		for(String e : ls2){
			System.out.println(e);
		}
		
		//使用指定元素填充列表的所有位置
		Collections.fill(ls2, "7777");
		for(String e : ls2){
			System.out.println(e);
		}
		for(String e : ls2){
			System.out.println(e);
		}
		
		//将列表中的元素顺序进行反转
		Collections.reverse(ls);
		for(String e : ls){
			System.out.println(e);
		}*/
		
		//随机置换列表中的元素位置，每次执行都不同
		Collections.shuffle(ls);
		for(String e : ls){
			System.out.println(e);
		}
		
		//按照列表中的自然顺序进行快排
		Collections.sort(ls);
		for(String e : ls){
			System.out.println(e);
		}
		
		//将列表中两元素的位置进行互换
		Collections.swap(ls, 0, 1);
		for(String e : ls){
			System.out.println(e);
		}
	}
}
