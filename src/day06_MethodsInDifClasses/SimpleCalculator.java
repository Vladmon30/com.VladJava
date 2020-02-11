package day06_MethodsInDifClasses;

public class SimpleCalculator {
	
	public static int calculate(int num1, int num2,String op) {
		switch(op){
			case "+":
				return increment(num1,num2);
			case "-":
				return dicrement(num1,num2);
			case "*":
				return multiple(num1, num2);
			case "/":
				return devide(num1,num2);
			default:
				throw new RuntimeException("Error"+ op);
		}
		
	}

	public static int multiple(int num1, int num2) {
		
		int res = num1 * num2;
		
		
		return res;
		
	}

	public static int increment(int n , int t) {
		
		int c = n+t;
		return c;
		
	}

	public static int dicrement(int i, int j) {
		int t = i-j;
		
		return t;
		
	}

	public static int devide(int g, int c) {
		int k = g/c;
		return k;
		
	}



}
