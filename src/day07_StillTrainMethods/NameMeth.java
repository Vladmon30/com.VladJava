package day07_StillTrainMethods;

import java.util.Arrays;

public class NameMeth {
	
	public static char[] method(String name) {
		
		char [] ar = new char[name.length()];
		
		for(int i =0;i<name.length();i++) {
			ar[i]=name.charAt(i);	
		}
		
		return ar;
		
		
	}

}
