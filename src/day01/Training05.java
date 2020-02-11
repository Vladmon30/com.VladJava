package day01;

import java.util.Scanner;

public class Training05 {
	public static void main(String [] args) {
		/*
		 * 1. You have 2 variables num1, num2
			assign value of larger one into variable max
			print value of max -> "Max: number"	
			
		   2. You have 3 variables num1, num2, num3
			assign value of largest one into variable max
			print value of max -> "Max: number"	
			
		 */
		int max=0;
		System.out.println("Enter 3 num:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			max=num1;
		}
		if(num2>num1 && num2>num3) {
			max=num2;
		}
		else {
			max=num3;
		}
		System.out.println("Num: " + max+ " is max!");
	}
	
}
