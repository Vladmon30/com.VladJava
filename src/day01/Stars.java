package day01;

public class Stars {

	public static void main(String[] args) {
		
	/*
	 *  12345678910
		12345678910
		12345678910
		12345678910
		12345678910
		12345678910
		12345678910
		12345678910
		12345678910
		12345678910
			 */
		
		
	
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 123456
		 * 1234567
		 * 12345678
		 * 123456789
		 * 12345678910
		 */
		
		for (int i=1;i<=10; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		/*
		 * 12345678910
		 * 123456789
		 * 12345678
		 * 1234567
		 * 123456
		 * 12345
		 * 1234
		 * 123
		 * 12
		 * 1
		 */
		System.out.println("========================");
		
				for(int i = 10; i>=1;i--) {
					for(int j=1;j<=j;j++) {
						System.out.print(i+ " ");
					}
		System.out.println();
	}}}