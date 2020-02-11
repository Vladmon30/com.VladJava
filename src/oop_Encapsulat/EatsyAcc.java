package oop_Encapsulat;

public class EatsyAcc {
	private String email;
	private String firstName;
	private String password;
	
	public EatsyAcc() {
		
	}
	
	public void setAccountInfo(String email, String firstName, String password) {
		this.email = email;
		this.firstName = firstName;
		this.password = password;
	}
	
	/*
	 * create a method getAccountInfo() that returns email, first name, password values 
	 * in this format: myemail@gmail.com | Bill | abc123
	 */
	public String getAccountInfo() {			
		return this.email+"|"+this.firstName+"|"+this.password;
	
	}
//-----------------
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

//-----------
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

//----------------	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.length()<6) {
			System.out.println("Password must be at least 6 char.");
			return;
		}
		this.password = password;
	}
	
	
	
}
