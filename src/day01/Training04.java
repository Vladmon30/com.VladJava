package day01;

import java.util.Scanner;

public class Training04 {

	public static void main(String[] args) {
		/*
		 * Create a program that accepts value 
		 * in miles and converts to kilometers
		 */
		
		System.out.println("Enter value in mls: ");
		
		Scanner scan = new Scanner(System.in);
		int miles = scan.nextInt();
		
		
		double km = miles*1.6;
			
		System.out.println( miles + "miles is equal " + km + "km");
		
	}

}
