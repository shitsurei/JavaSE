package ds;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map是一种双列集合，常用于处理有对应关系的数据，key不能重复
 * @author 张国荣
 * Map常用功能
 */
public class MapDemo {
	public static void main(String[] args) {
		//创建对象
		Map<String,String> map = new HashMap<>();
		//映射功能（put）,将key映射到value，如果key存在，则覆盖value，并将原来的value返回，如果key不存子啊则返回null
		//put方法同样会面临存储对象时的去重问题，可以通过重写类的hashcode和equals方法解决
		System.out.println(map.put("itcast001", "zs"));//null
		System.out.println(map.put("itcast002", "ls"));//null
		System.out.println(map);//{itcast001=zs, itcast002=ls}
		System.out.println(map.put("itcast001", "ww"));//zs
		System.out.println(map);//{itcast001=ww, itcast002=ls}
		//获取功能,获取单个元素或元素个数
		System.out.println(map.get("itcast001"));//ww
		System.out.println(map.size());
		//判断功能,判断指定的key或value是否存在，以及map是否为空
		System.out.println(map.containsKey("itcast001"));//true
		System.out.println(map.containsKey("itcast003"));//false
		System.out.println(map.containsValue("ww"));//true
		System.out.println(map.containsValue("zs"));//false
		System.out.println(map.isEmpty());
		//删除功能，删除单个元素或清空删除成功返回删除的value，失败返回null
		System.out.println(map.remove("itcast001"));//ww
		System.out.println(map);//{itcast002=ls}
		//map.clear();
		//遍历功能,keySet返回Set，不允许重复
		Set<String> keys = map.keySet();
		for(String e : keys) {
			System.out.println(e);
		}
		//value返回Collection,可以重复
		Collection<String> values = map.values();
		for(String e: values) {
			System.out.println(e);
		}
		//entrySet返回Set<Map.Entry<K,V>>，Entry对象时Set的内部子类，保存映射关系
		Set<Map.Entry<String, String>> entrys = map.entrySet();
		for(Map.Entry<String, String> e : entrys) {
			System.out.println(e.getKey()+"--"+e.getValue());
		}
	}
}
