package day10_Overloading_ArrayList;

public class Overlding {

	public static void main(String[] args) {
		add();
		add(2,4);
		add("Vlad","Mon");
		
		System.out.println("2: "+ add(2,4));
		System.out.println("3: + "+ add("Vlad","Mon"));
	}

	private static void add() {
		System.out.println("1: "+"Overloading Method");	
	}
	
	private static int add(int num1, int num2) {
		int num = num1 + num2;	
		return num;
	}

	private static String add(String name, String lastN) {
		String both = name + lastN;
		return both;	
	}


}
