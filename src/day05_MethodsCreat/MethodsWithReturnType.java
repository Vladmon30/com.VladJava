package day05_MethodsCreat;

public class MethodsWithReturnType {

	public static void main(String[] args) {
		
		//get president name from the method and assign to president.
		//then print out "US president is [president]

		
		String presName = president();
		System.out.println("President name is: " + presName);
		
		String lastName = lastName();
		System.out.println("Last name is: " + lastName);
	
		String fullName = president()+ " "+lastName();
		System.out.println("full name is : " + fullName);
	}

	private static String lastName() {
		String ln = "Monchanov";
		return ln;
	}

	private static String president() {
		
		String name = "Vlad";
		return name;
	}
	
	

}
