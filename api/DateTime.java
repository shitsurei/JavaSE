package api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Date和Format
 * @author 张国荣
 *
 */
public class DateTime {
	public static void main(String[] args) {
		//无参构造，默认传0
		Date d = new Date();
		System.out.println(d);
		//有参构造，传入long型整数，计算1970年1月1日当前时区经过参数毫秒后的时间
		d = new Date(12345678910l);
		System.out.println(d);
		/**
		 * 日期格式化 
		 * 1. 无参构造，默认的模式
		 * 2. 有参构造，使用特定的模式
		 */
		SimpleDateFormat sdf = new SimpleDateFormat();
		String ds = sdf.format(d);
		System.out.println(ds);
		sdf = new SimpleDateFormat("yyyy年MM月dd日	HH时mm分ss秒");
		ds = sdf.format(d);
		System.out.println(ds);
		/**
		 * 格式化日期解析
		 * 1. 对于无参的SimpleDateFormat对象，解析的字符串模式必须和构建对象的模式一样
		 */
		try {
			sdf = new SimpleDateFormat();
			d = sdf.parse("70-5-24 上午5:21");
			System.out.println(d.toLocaleString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		/**
		 * 日历类
		 * 1. 静态工厂无参生成对象，使用默认的时区获取日历
		 * 2. 其类中的静态成员变量存储的日期相关字段，使用枚举类型获取
		 */
		Calendar c = Calendar.getInstance();
		
		//获取年份
		System.out.println(c.get(Calendar.YEAR));
		//获取月份，从0开始，需要加一
		System.out.println(c.get(Calendar.MONTH)+1);
		//获取日期
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		//设置年份
		c.set(Calendar.YEAR, 2018);
		System.out.println(c.get(Calendar.YEAR));
		//月份和日期同理
		
		//在已有的时间系统上加减时间，即向前向后进行时间的滚动
		c.add(Calendar.YEAR, 2);
		System.out.println(c.get(Calendar.YEAR));//2020		
		c.add(Calendar.YEAR, -4);
		System.out.println(c.get(Calendar.YEAR));//2016	
		//月份和日期同理
	}
}
