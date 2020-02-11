package day08_Methods;

import java.util.Arrays;

public class AddArrays {

	public static void main(String[] args) {
		
		int [] arr1  = {1,2,3};
		int [] arr2 = {2,3,4};
		
		 int[] arr =  addArrays(arr1, arr2);
		
		System.out.println(Arrays.toString(arr));
	}
		
		public static int [] addArrays(int [] ar1, int [] ar2) {
			
			int [] newAr = new int [ar1.length];
			
			for(int i=0; i<ar1.length;i++) {
				newAr[i] = ar1[i]+ar2[i]; 
				
			}
			
			
			return newAr;
		}
		
		
}
