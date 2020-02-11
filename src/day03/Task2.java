package day03;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/* ask user to enter nums, generete this random nums, put it in array, 
		 * and print it 
		 */
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("How many nums?");
		
		int count = sc.nextInt();
		
		int [] nums = new int[count];
		
		for(int i = 0; i<count;i++) {
			nums[i]=r.nextInt(100);
		}
		for(int n:nums) {
			System.out.print(n+" ");
		}
	}

}
