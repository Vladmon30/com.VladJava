package day01;

import java.util.Scanner;

public class Training06 {
	public static void main(String [] args) {
		
		String secretUserName = "vladmon";
		String secretPassword = "Kawasaki35";
		 String userName; 
		 String userPassword;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter user name: ");
		userName = sc.next();
		System.out.println("Thanks, now userPassword: ");
		userPassword = sc.next();
		
		if (userName.equals(secretUserName) && userPassword.equals(userPassword)) {
			System.out.println("Cangrats u in!!!");
		}
		if (userName.equals(secretUserName) && !userPassword.equals(secretPassword)) {
			System.out.println("Invalid user password");
		}
		if(!userName.equals(secretUserName) && userPassword.equals(userPassword)) {
			System.out.println("Invalid user name");
		}
		if (!userName.equals(secretUserName) && !userPassword.equals(userPassword)) {
			System.out.println("Invalid user name and password");
		}
	
		else { 
			System.out.println("Error!!!");
		}
		
	}}
		
		
		//2 variables, userName, password.
		//make sure they match wiht secret ones. and alloow login successfully
		//Whenever login is not successful, let program tell exact reason 
		//why it is not valid:
			//username is not valid
			//password is not valid
			//both username and password are invalid
	

