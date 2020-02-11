package day01;

import java.util.Scanner;

public class Training07 {

	public static void main(String[] args) {

		/*
		 * Print items you can purchase based on your budget
		 * 
		 * < 80 -> cannot buy anything
		 * > 435 -> u can buy everything
		 * if budget >= phone+watch
		 * 	you can buy phone+watch
		 * 	or phone+bag
		 * 	or watch + bag
		 * if budget >= phone+bag
		 * 	you can buy phone+bag
		 *  or watch + bag
		 * if budget >= watch+bag
		 * 	you can buy watch+bag
		 * 	
		 * if budget >= phone
		 * 		you can buy phone
		 * 	   or watch+bag
		 * if budget >= watch
		 * 		you can buy watch
		 * 		or bag
		 * else
		 * 	just a watch
		 */

		
		int phonePrice = 250;
		int watchPrice = 100;
		int bagPrice = 50;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Plese enter a budget ammount: ");
		int budget = sc.nextInt();
		
		
		if(budget>=400) {
			System.out.println("Supper u can buy everything");
		}
		if(budget>=50 && budget<100) {
			System.out.println("buy only bag");
		}
		if (budget>=100 && budget<150) {
			System.out.println("You can buy a bag or a watch ");
		}
		if(budget>=150 && budget <=250) {
			System.out.println("You can buy a bag+ watch or only phone");
		}
		if (budget>250 && budget<=300) {
			System.out.println("You can buy a bag+watch or bag + phone");
		}
		else{
			System.out.println("Sorry not enought money!!!");
				System.out.println("Sorry cant buy anything");
			}
		}	
	}


