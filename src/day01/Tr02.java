package day01;

import java.util.Scanner;

public class Tr02 {

	public static void main(String[] args) {
		/*
		 *  1.Ask user to enter 2 numbers for variables start and end:
			if start is less than end: loop from start position to end position
			and print "Step " + number.
			If start is more than end: loop backwards from end to start
			and print "Step "+ number.
		 */
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter  num1 :");
			int num1 = sc.nextInt();
			
			System.out.println("Enter  num2 :");
			int num2 = sc.nextInt();
		if(num1<num2) {
			System.out.println("Forward");
			while(num1<=num2) {
				System.out.println(num1);
			num1++;
			}}
		else if(num1>num2) {
			System.out.println("Backward: ");
			while(num1>=num2) {
				System.out.println(num1);
				num1--;
			}
		}
//		if (num1<num2) {
//			System.out.println("Forward: ");
//			while(num1<=num2) {
//				System.out.println("Step: " + num1 );
//			num1++;
//		}
//	}else if (num1>num2) {
//			System.out.println("Backward: ");
//			while(num1>=num2) {
//				System.out.println("Step: " + num1 );
//			num1--;
//		}
//	}

	}
}
