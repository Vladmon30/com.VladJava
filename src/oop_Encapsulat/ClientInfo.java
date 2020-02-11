package oop_Encapsulat;

public class ClientInfo {
	
	private String passport;
	private int ssn;
	public String name;
	
	
	public void setAllInfo (String passport, int ssn, String name) {
		this.passport = passport;
		this.ssn  = ssn;
		this.name = name;
	}
	
	public String getAllInfo() {
		String allInfo = name+"|"+passport+"|"+ssn;
		System.out.println(allInfo);
		return allInfo;
	}
//---------------------
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
//---------------------	
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
//----------------------

	
}
