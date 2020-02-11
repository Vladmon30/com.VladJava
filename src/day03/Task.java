package day03;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		//ask user to enter how many items in array, 
		//create array called nums with that capacity
		//using a loop enter values one by one
		//print all items in same line using for each loop
		//iterate in array and find the largest value
		// assume that first one is largest
		//loop through the rest and check if they are greater than value of largest
		//if true -> assign that value into largest. 
		//print out "Largest: " + largest after the loop
		System.out.println("How many items:");
		Scanner sc = new Scanner(System.in);
		int item = sc.nextInt();
		int [] nums = new int[item];
		
		for(int i=0; i<nums.length;i++) {
			System.out.println("Enter num "+(i+1)+": ");
			nums[i]=sc.nextInt();
			
		}
		
		for(int num:nums)
			
		System.out.print( num + " ");
				
		System.out.println("\n--------");
		
		int l =nums[0];
		for(int n:nums) {
			if(n>l) {
				l=n;
				
		System.out.println("larger is: " + l);
			}
		}
		
	}
		
	}	
	
		
	

