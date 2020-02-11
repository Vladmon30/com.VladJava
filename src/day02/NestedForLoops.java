package day02;

public class NestedForLoops {

	public static void main(String[] args) {
			
		String [][] colors = { 
								{"Red", "White", "Blue", "Grey"},           //0
							    {"Orange", "Yellow", "Green", "Black"},     //1
							    {"Dark", "Purple", "Ultramarin","Brown"}    //2
							   };
							 
			for (int row = 0; row <3; row ++) {    //horiz
				for(int col = 0; col <4; col++) {  //vertik
					System.out.print(colors[row][col] + " ");

				}
				System.out.println();
			}
			
			System.out.println("------------------");
			
//			for (int i = 0; i < 3; i++) {
//				for (int j = 0; j < 6; j++) {
//					System.out.print("i:" + i + ", j: " + j + " ");
			
			for(int i = 1; i<=5;i++) {
				for(int j=1 ; j<=4; j++) {
					System.out.print("i:" + i + " ,j:" + j + "   ");
			
				}
				System.out.println();
				}
			System.out.println("-----------------");
			
			for(int i = 1; i<=5;i++) {
				for(int j=1 ; j<=i; j++) {
					System.out.print("i:" + i + " ,j:" + j + "   ");

			
	}
				System.out.println();
}
}
}