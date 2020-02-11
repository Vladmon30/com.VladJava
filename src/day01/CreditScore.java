package day01;

import java.util.Scanner;

public class CreditScore {

	public static void main(String[] args) {
		/*
		 * if negative number or more than 850
		 * -> invalid score
		 * 1 - 299 -> Bad credit
		 * 0 -> No credit
		 */
		
		int creditScore;
		String creditStatus;
		
		System.out.println("Fico Credit Score");
		System.out.println("Please enter your credit score: ");
		
		
		Scanner scan = new Scanner(System.in);
		creditScore = scan.nextInt();
		
		if(creditScore<0 || creditScore>850) {
			creditStatus="unknown";
			
		}
		else if(creditScore<350) {
			creditStatus="bad credit";
			
		}
		else if(creditScore>350 && creditScore<580) {
			creditStatus= "Very Poor Credit";
			
		}
		else if(creditScore>580 && creditScore<700) {
			creditStatus= "Poor Credit";
		}
		else if(creditScore>700 && creditScore<800)
		{
			creditStatus="Good Credit";
		}
		else {
			creditStatus="Excelent Credit";
		}
		System.out.println(creditStatus);
		
		
		

	}

}
