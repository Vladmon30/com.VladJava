package day15_Exceptions;

import java.io.File;
import java.util.Scanner;

public class Inet {

	public static void main(String[] args) {
	String name ="Vlad";
	File file = new File("C:Users/Vlad/Desktop.txt");
		try { 
			Scanner sc = new Scanner(file);
			System.out.println(name.charAt(2));	
		} catch (Exception e) {
			System.out.println("File not found");
		}
	}

}
