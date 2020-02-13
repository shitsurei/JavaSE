package io.iostream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManagerIO {
	private static final String FILEPATH= "ManagerFile.txt"; 
	private BufferedReader br;
	private BufferedWriter bw;
	
	public ManagerIO() {
		File f = new File(FILEPATH);
		if(!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public List<ManagerBean> load(){
		List<ManagerBean> emList = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(FILEPATH));
			String line;
			String[] value;
			ManagerBean mb;
			while((line = br.readLine())!=null) {
				value = line.split(",");
				mb = new ManagerBean();
				mb.setId(value[0]);
				mb.setName(value[1]);
				mb.setAge(Integer.valueOf(value[2]));
				mb.setLeader(Boolean.valueOf(value[3]));
				emList.add(mb);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return emList;
	}
	
	public void save(List<ManagerBean> emList) {
		try {
			bw = new BufferedWriter(new FileWriter(FILEPATH));
			StringBuilder sb;
			for(ManagerBean e : emList) {
				sb = new StringBuilder();
				sb.append(e.getId()).append(",").append(e.getName()).append(",").append(e.getAge()).append(",").append(e.isLeader());
				bw.write(sb.toString());
				bw.newLine();
				bw.flush();
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
