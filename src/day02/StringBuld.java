package day02;

public class StringBuld {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder();
		
		str.append("Vlad ");
		str.append("Maryna ");
		str.append("Denys ");
		str.append("Polina ");
		
		System.out.println(str);
		
		
		System.out.println(str.reverse());
		
		
		String names =str.toString();
		
		System.out.println(names);
		
		String revBackName="";
			for(int i =names.length()-1;i>=0;i-- ) {
				revBackName+=names.charAt(i);
			}
			System.out.println(revBackName);
	}

}
