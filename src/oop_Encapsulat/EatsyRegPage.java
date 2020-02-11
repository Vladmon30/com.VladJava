package oop_Encapsulat;

public class EatsyRegPage {

	public static void main(String[] args) {
		
		EatsyAcc account1 = new EatsyAcc();
			account1.setEmail("vladmon30@gmail.com");
			account1.setFirstName("Vlad");
			account1.setPassword("123456");
		
		
		EatsyAcc account2 = new EatsyAcc();
			account2.setEmail("marynamon30@gmail.com");
			account2.setFirstName("Maryna");
			account2.setPassword("654321");
			
		System.out.println("First name acc1 is: " + account1.getFirstName());		//use getters to read data
		System.out.println("Account info acc1 is: " + account1.getAccountInfo());
		
		EatsyAcc denysAcc = new EatsyAcc();   //create new accound denys
		
		denysAcc.setAccountInfo("denysmon10@yahoo.com", "Denys", "Denys1234");		//myAccount.setAccountInfo
			System.out.println(denysAcc.getEmail().replace("yahoo", "gmail"));		// replace old email by new one 
			System.out.println("Denys new email is: "+ denysAcc.getEmail());
		
		
	}
}
