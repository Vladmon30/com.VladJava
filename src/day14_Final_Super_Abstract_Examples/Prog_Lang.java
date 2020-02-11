package day14_Final_Super_Abstract_Examples;

public class Prog_Lang extends Lang_Lang {
	
	String name = "Program";
	
	public static void staticMethod() {
		System.out.println("Programing static method");
	}
	
	public void printName() {
		System.out.println("Programing: " + name);
	}
}
