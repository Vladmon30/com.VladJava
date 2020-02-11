package day05_MethodsCreat;

public class ReturnIntMethod {

	public static void main(String[] args) {

		//Method getMax that accepts 2 ints and return larger one
		
		int max = getMax(40,30);
		System.out.println("max num is: " + max);

	}

	private static int getMax(int num1, int num2) {
		
			int res = 0;

			if(num1>num2) {
				res = num1;
				//System.out.println(res);
			}else if(num1<num2){
				res=num2;
				//System.out.println(res);
			}else if(num1==num2) {
				//System.out.println("Equals");
			}
		
		
		return res;
	}

}
