package day01;

import java.util.Scanner;

public class Tr06 {

	public static void main(String[] args) {
		/*
		 *1. Write a program that asks a student what is their Batch number.
		 * if that is 10, say - we are classmates!
		 * if not , say something else
		 */
		
		
		System.out.println("What is your batch number?");
		Scanner sc = new Scanner(System.in);
		int batchNum = sc.nextInt();
		
		if(batchNum == 10) 
		{
			System.out.println("We are classmates");
		}
		else 
		{
			System.out.println("We are not classmates");
		}
			
		}

	}


