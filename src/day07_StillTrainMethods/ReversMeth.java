package day07_StillTrainMethods;

public class ReversMeth {
	
	public static String reversed(String or) {
			
		String rev =" ";
		
		for(int i=or.length()-1;i>=0;i--) {
			rev+=or.charAt(i);
		}
		
		return rev;
		
		
	}

	public static boolean palindr(String orig) {
		String pal ="";
			for(int i=orig.length()-1;i>=0;i--) {
				pal+=orig.charAt(i);
			}
			if(orig.equalsIgnoreCase(pal)) {
				return true;
			}
			return false;
	}
}
