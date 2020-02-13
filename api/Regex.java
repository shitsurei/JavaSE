package api;

/**
 * 正则表达式，用于校验字符串模式
 * @author 张国荣
 * 以校验邮箱为例：
 * 1.20位以内
 * 2.以.com结尾
 * 3.中间有符号@
 * 4.只能包含数字，字母下划线
 */
public class Regex {
	public static void main(String[] args) {
		System.out.println(checkEmail("lfegwj21345@163.com"));
	}
	
	public static boolean checkEmail(String email) {
		return email.matches("[0-9a-zA-Z]+@[0-9a-zA-Z]+.com");
	}
}
