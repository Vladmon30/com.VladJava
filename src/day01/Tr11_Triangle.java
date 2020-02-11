package day01;

public class Tr11_Triangle {

	public static void main(String[] args) {		
		/* 
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
	*/	
		for(int vert = 1; vert<=10; vert ++ ) { //col = stroka vertikal
			
			for(int hor =1; hor<=vert;hor++ ) {   //row = ryad horizont
				
				System.out.print(hor+" ");
			}
				System.out.println();
		}
		System.out.println("-------------");
	/*	
	 * 12345
	 * 1234
	 * 123
	 * 12
	 * 1
	 */	
		for(int col = 10; col >=1; col -- ) {
			for(int row = 1; row<=col; row++ ) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
		
		
	}}

