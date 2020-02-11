package day01;

public class Training_Stars {

	public static void main(String[] args) {
		/*  *
		 * -**-
		 * -***-
		 * -****-
		 */
		
		String star = " ";
		int count = 1;
		
		while(count<=5) {
			star=star+ "-*";
			System.out.println(star);
				count++;
		}
	
		System.out.println(" *");
	String stairs="-*";
	
	stairs += stairs;//*
	System.out.println(stairs +"-");
	System.out.println("-*-*-*-");
	stairs += stairs;//**
	System.out.println(stairs+"-");
	stairs += stairs;//***
	System.out.println(stairs+"-");
	
}
}