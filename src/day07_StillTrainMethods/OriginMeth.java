package day07_StillTrainMethods;

public class OriginMeth {
	
	public static void main(String[] args) {
		
		String orig = "VladdalV";
		String word = "Dalv";
		String rev = ReversMeth.reversed(orig);
		System.out.println(rev);
		
		Boolean pal =ReversMeth.palindr(orig); 
				System.out.println(pal);
				
		
	}

	
}
