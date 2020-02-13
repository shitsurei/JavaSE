package io.iostream;

import java.util.List;
import java.util.Scanner;

public class ManagerOperater {
	private List<ManagerBean> emList;
	private Scanner sc;
	private boolean change;
	public ManagerOperater(List<ManagerBean> emList) {
		sc = new Scanner(System.in);
		this.emList = emList;
		change = false;
		start();
	}
	
	private void start() {
		while(true) {
			System.out.println("--------------------------------");
			System.out.println("select option with number follows:");
			System.out.println("1.select");
			System.out.println("2.add");
			System.out.println("3.edit");
			System.out.println("4.delete");
			System.out.println("5.save");
			System.out.println("6.exit");
			System.out.println("--------------------------------");
			int choice = sc.nextInt();
			//scanner除了nextline以外的方法都不会读取换行符\r，故执行过后在调用一次该方法来清空缓冲区
			sc.nextLine();
			switch (choice) {
			case 1:
				select();
				break;
			case 2:
				add();
				ask();
				break;
			case 3:
				edit();
				ask();
				break;
			case 4:
				delete();
				ask();
				break;
			case 5:
				save();
				break;
			case 6:
				ask();
				System.out.println("thanks for using");
				System.exit(0);
				break;
			default:
				System.out.println("wrong number,select again");
				break;
			}
		}
	}
	
	public void ask() {
		if(change) {
			System.out.println("record have changed.save now?[Y/N]");
			char answer = sc.nextLine().charAt(0);
			switch (answer) {
			case 'Y':
				save();
				break;
			case 'N':
				break;
			default:
				System.out.println("invaild input,not save");
				break;
			}
		}
	}
	
	public void save() {
		if(change) {
			new ManagerIO().save(emList);
			System.out.println("save success");
			change = false;
		}else {
			System.out.println("have not changed,no need save");
		}
	}
	
	public void select() {
		if(emList.isEmpty()) {
			System.out.println("now record is empty,please add item first");
			return;
		}
		System.out.println("-------------------------------------");
		System.out.println("ID\tNAME\tAGE\tIS_LEADER");
		for(ManagerBean e : emList) {
			System.out.println(new StringBuilder().append(e.getId()).append("\t").append(e.getName()).append("\t").append(e.getAge()).append("\t").append(e.isLeader()));
		}
		System.out.println("-------------------------------------");
	}
	
	public void add() {
		ManagerBean mb = new ManagerBean();
		boolean repeat = false;
		while(true) {
			System.out.println("please input new ID:");
			String id = sc.nextLine();
			for(ManagerBean e : emList) {
				if(e.getId().equals(id)) {
					repeat = true;
					break;
				}
			}
			if(repeat) {
				System.out.println("sorry,this ID have existed.");
			}else {
				mb.setId(id);
				break;
			}
		}
		set(mb);
		emList.add(mb);
		change = true;
	}
	
	public ManagerBean find(String id) {
		for(ManagerBean e : emList) {
			if(e.getId().equals(id))
				return e;
		}
		return null;
	}
	
	public void edit() {
		System.out.println("please input ID which need edit:");
		ManagerBean mb = find(sc.nextLine());
		if(mb==null) {
			System.out.println("this ID does not exist");
		}else {
			set(mb);
			System.out.println("change success");
			change = true;
		}
	}
	
	public void delete() {
		System.out.println("please input ID which need delete:");
		ManagerBean mb = find(sc.nextLine());
		if(mb==null) {
			System.out.println("this ID does not exist");
		}else {
			emList.remove(mb);
			System.out.println(mb.getName()+" has been deleted");
			change = true;
		}
	}
	
	public void set(ManagerBean mb) {
		System.out.println("please input new Name:");
		String name = sc.nextLine();
		mb.setName(name);
		System.out.println("please input new Age:");
		int age = sc.nextInt();
		//同理清空缓冲区
		sc.nextLine();
		mb.setAge(age);
		System.out.println("is this one a Leader?[Y/N]");
		char answer = sc.nextLine().charAt(0);
		switch (answer) {
		case 'Y':
			mb.setLeader(true);
			break;
		case 'N':
			mb.setLeader(false);
			break;
		default:
			System.out.println("invaild input,default set not leader");
			mb.setLeader(false);
			break;
		}
	}
}
