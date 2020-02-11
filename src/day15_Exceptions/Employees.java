package day15_Exceptions;

public class Employees {

	public static void main(String[] args) {
		int [] emplNum = {11,23,12,43,54};
		
		try {
			System.out.println(emplNum[4]);
		} catch (Exception e) {
			System.out.println("its no such index");
		}
	}

}
