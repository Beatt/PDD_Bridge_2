package pdd.proxy2.proxy;

import java.util.Scanner;
import pdd.proxy2.entity.ICommunication;
import pdd.proxy2.entity.SpaceBook;

public class MySpaceBook {
	
	private ICommunication mySpaceBook;
	private String password;
	private String name;
	private boolean loggedIn = false;
	private Scanner scanner = new Scanner(System.in);
	
	public void register() {
		
		
		System.out.println("Let's register you for SpaceBook");
		
		do {
			
			System.out.println("All SpaceBook names must be unique");
			System.out.println("Type in a user name: ");
			name = scanner.nextLine();
			
		}while(SpaceBook.IsUnique(name));
		
		System.out.println("Type in a password: ");
		password = scanner.nextLine();
		System.out.println("Thanks for registering with SpaceBook");
		
	}//Fin register
	
	public boolean authenticate() {
		
		System.out.println("Welcome " + name + " . Please type in your password: ");
		String supplied = scanner.nextLine();
		
		if(supplied.equals(password)) {
		
			loggedIn = true;
			System.out.println("Looged into SpaceBook");
			
			if(mySpaceBook == null) {
				
				mySpaceBook = new SpaceBook(name);
			}
			return true;
		}
		
		System.out.println("Incorrect password");
		return false;
		
	}//Fin authenticate
	
	public void add(String message) {
		check();
		
		if(loggedIn) {
			mySpaceBook.add(message);
		}
		
	}//Fin add
	
	public void add(String friend, String message) {
		check();
		
		if(loggedIn) {
			mySpaceBook.add(friend, name + " said: " + message);
		}
		
	}//Fin add
	
	public void poke(String who) {
		check();
		
		if(loggedIn) {
			mySpaceBook.poke(who, name);
		}
		
	}//Fin poke
	
	public void check() {
		
		if(!loggedIn) {
			if(password == null) {
				register();
			}
			if(mySpaceBook == null) {
				authenticate();
			}
		}
		
	}//Fin check
	
}//Fin MySpaceBook
