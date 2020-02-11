package day01;

import java.util.Scanner;

public class Training03 {

	public static void main(String[] args) {
		/* Warm up task 1:
		 * Write a program that asks user to enter 3 numbers from keyboard
		 * and calculates the sum of those numbers then show result
		 */
		//Create a scanner
		
		
		System.out.println(" Please enter 3 num: ");
		Scanner nums = new Scanner(System.in);
		
		int nums1 =nums.nextInt();
		int nums2 = nums.nextInt();
		int nums3 = nums.nextInt();
		
		int sumOfNums = nums1+nums2+nums3;
		
		System.out.println(sumOfNums);
		

	}

}
