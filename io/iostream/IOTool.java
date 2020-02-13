package io.iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTool {
	private FileReader fr;
	private FileWriter fw;
	private StringBuilder sb;
	
	public String readerFile(String filePath) {
		try {
			fr = new FileReader(filePath);
			sb = new StringBuilder();
			int ch;
			while((ch=fr.read())!=-1) {
				sb.append((char)ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	public boolean writeFile(String content,String filePath,boolean append) {
		if(content==null||filePath==null) {
			return false;
		}
		try {
			fw = new FileWriter(filePath,append);
			fw.write(content);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean copyFile(String source,String destition,boolean append) {
		if(writeFile(readerFile(source), destition,append))
			return true;
		return false;
	}
}
