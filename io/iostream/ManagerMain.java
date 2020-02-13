package io.iostream;

public class ManagerMain {
	public static void main(String[] args) {
		System.out.println("Welcom to Employee System");
		System.out.println("initializing...");
		new ManagerOperater(new ManagerIO().load());		
	}
}
