package day05_MethodsCreat;

public class WriteEmail {

	public static void main(String[] args) {
			
		// build Email that will accept 2 String parms: firstname and lastname and
		// return a full  String email.  
		// by adding @gmail.com
		
		
		String newEmail = buildEmail("Vlad" , "Mon");   //vlad_mon@gmail.com
		System.out.println(newEmail);
	}

	private static String buildEmail(String firstName ,String lastName) {
					
			String email = firstName.toLowerCase()+"_"+lastName.toLowerCase()+"@gmail.com";
			return email;
		
		
		
		
	}

}
