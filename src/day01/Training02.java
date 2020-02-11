package day01;

import java.io.InputStream;
import java.util.Scanner;

public class Training02 {
	

	public static void main(String [] args) {
		int n; int i;
		
		n =5;
		i=10;
		
		n=i+n; //5 + 10 =15
		i=n-i; // 5= 15-10
		n=n-i;  // 15-5 =10
		
				System.out.println("n = "+ n + ", i = "+ i);
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter current year: " );
				int curentYear= scan.nextInt();
				
				
				
				System.out.println("Enter year of birth: " );
				int yearOfBirth =  scan.nextInt();
				
				int age = curentYear-yearOfBirth;
				
				System.out.println("If current year is " + curentYear+" and year of birth is "
						+ yearOfBirth+ " then age is: " +age);
			
		
			
	}

	private static void Scanner(InputStream in) {
		// TODO Auto-generated method stub
		
	}
}
