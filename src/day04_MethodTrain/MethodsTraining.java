package day04_MethodTrain;

public class MethodsTraining {

	public static void main(String[] args) {
		
		sayHello("Hi");

	}

	private static void sayHello(String greatings) {
		
		String hello = greatings;
		int count = 5;
		for(int i=0;i<hello.length();i++)
			count++;
		System.out.println(count);
		
	}

}
