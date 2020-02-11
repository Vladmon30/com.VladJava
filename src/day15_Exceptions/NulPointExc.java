package day15_Exceptions;

import java.util.ArrayList;
import java.util.List;

public class NulPointExc   {
	
	static List<Integer> integ = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		
		try {
			System.out.println(integ.get(0));
			
		}
		catch (Exception e) {
			System.out.println("No such index");
		}
	}

}
