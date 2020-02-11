package day11_CustomClas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompGold {
	
	public static void main(String[] args) {
		
		EmployeeGold seller1 = new EmployeeGold();
		seller1.name = "Luba";
		seller1.lastName = "Borisova";
		seller1.age = 30;
		seller1.jobTitle= " St. seller";
	    seller1.email = seller1.name+seller1.lastName+"@gmail.com";
		
		EmployeeGold seller2 = new EmployeeGold();
		seller2.name = "Juli";
		seller2.lastName = "Kyznetsovska";
		seller2.age = 32;
		seller2.jobTitle="MD seller";
		seller2.email = seller2.name+seller2.lastName+"@gmail.com";
//		System.out.println(seller1.name);
//		seller1.work();
//		System.out.println(seller2.name);
//		seller2.rest();
		
		seller1.work();
		seller2.work();
			
	
	}
}
