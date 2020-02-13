package io.iostream;

public class Test {
	public static void main(String[] args) {
//		IOTool io = new IOTool();
//		io.copyFile("c:/worktest/a.txt", "c:/worktest/b.txt",true);
		new BufferStream().copyBufferedStream("c:/worktest/a.txt", "c:/worktest/b.txt");
	}
}
