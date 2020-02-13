package debug;

/**
 * 
 * @author 张国荣
 *断点调试的作用：查看程序的执行流程，调试程序
 *断点其实就是一个标记
 *哪里看不懂在哪里加断点（必须加载有效的语句上），代码区左侧双击
 *多个方法需要加多个断点才能查看方法执行过程
 *执行时需要使用debug as和debug视图
 *（F6）step over按钮用于在断点后一步步产看程序的执行
 *完成后切换回java视图
 *
 *观察区域：
 *代码区域，看程序的执行流程
 *debug区域，看程序的执行流程
 *variables区域，看变量的产生、变化和消失
 *console区域，看控制台的输出
 *
 *删除断点可以重复双击断电或debug视图中的breakpoint处全部移除
 */
public class Demo {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println("c="+c);
	}
}
