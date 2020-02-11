package day02;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		/* Create shop
		 * ask user how many items he have
		 * declare items and all price for them
		 * ask what is item 1,2,3..
		 * ask what price for item 1 , item2 ...
		 * if its all your items print all of their names
		 * and total price 
		 * 
		 */	
		System.out.println("Welcome to our Shop!");
		Scanner sc = new Scanner (System.in);
			System.out.println("How many items you buy?");	
			
		int itemCount = sc.nextInt();
		
		String allItem = "";
		int totalPrice=0;
		
		for(int i=1;i<=itemCount;i++) {
			
			System.out.println("What is item " +i+ " ?" );
			String item = sc.next();
		
			System.out.println("What price of item:" + item+ "?");
			int price = sc.nextInt();
			
			if(i==itemCount) {
				allItem= allItem+item;
			}else {
				allItem=allItem+item+", ";
		}
			totalPrice = totalPrice+ price;
		}
		System.out.println("You boought: "+ allItem);
		System.out.println("Your total price is: " + totalPrice );
		
	}

}
