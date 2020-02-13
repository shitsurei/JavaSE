package collection;

import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author 张国荣
 * 1.可以将键值对在文件和内存之间进行读取
 * 2.hashtable是同步的，安全性高效率低；hashmap相反
 * 3.表示一个持久的属性集,其键值对都是字符串
 */
public class PropertiesDemo {
	public static void main(String[] args) {
		//创建属性列表对象
		Properties prop = new Properties();
		//添加映射关系
		prop.put("hello1", "world5");
		prop.put("hello2", "world4");
		prop.put("hello3", "world3");
		prop.setProperty("hello3", "world5");
		prop.put("hello4", "world2");
		prop.put("hello5", "world1");
		/*//遍历属性列表
		//1.获取所有的key，通过key获取value
		Set<Object> aa = prop.keySet();
		for(Object e : aa) {
			Object value = prop.get(e);
			System.out.println(e+"--"+value);
		}
		//2.返回所有的映射关系对象
		Set<Map.Entry<Object, Object>> sets = prop.entrySet();
		for(Map.Entry<Object, Object> e : sets) {
			System.out.println(e.getKey()+"--"+e.getValue());
		}*/
		
		
		//Properties和IO流的结合，将键值对写入文件
		try {
			/*PrintWriter pw = new PrintWriter("C:/worktest/b.txt");
			//list方法只能接收打印流
			prop.list(pw);
			pw.close();*/
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/worktest/b.txt")));
			//store方法可以接受任何输出流
			prop.store(bw, "something you want to remember");
			bw.close();
			
			//创建输入流
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:/worktest/b.txt")));
			prop.load(br);
			Set<Map.Entry<Object, Object>> sets = prop.entrySet();
			for(Map.Entry<Object, Object> e : sets) {
				System.out.println(e.getKey()+"--"+e.getValue());
			}
			br.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
