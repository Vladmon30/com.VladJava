package day06_MethodsInDifClasses;

import java.util.Scanner;

public class SimpleCalculatorMethods {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 =2;
	
		int multiple = SimpleCalculator.multiple(num1,num2);
		int increm = SimpleCalculator.increment(num1, num2);
		int dicrem = SimpleCalculator.dicrement(num1, num2);
		int devide = SimpleCalculator.devide(num1,num2);
			
		
		int operator = SimpleCalculator.calculate(20, 10, "*");//20*10=200
		System.out.println("OPERATOR: " + operator);
		
		System.out.println("multiply: " + multiple); 	//5*2=10
		System.out.println("increment is: " + increm);	//5+2=7
		System.out.println("dicrement is: " + dicrem);	//5-2=3
		System.out.println("devide is: " + devide);		//5/2=2
		
	}
}
