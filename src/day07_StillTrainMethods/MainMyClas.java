package day07_StillTrainMethods;

public class MainMyClas {

	public static void main(String[] args) {
		String putName = "Vlad";
		String putLastName ="Monchanov";
		MyClas.sayHello(putName+" "+putLastName);
		
		
		
		int [] num = {1,2,3};
		sumOfNum(num);
		

	}

	private static void sumOfNum(int... nums) {
		int num =0;
		for(int sum:nums) {
			num+=sum;
		}
		System.out.println("SumOfNums is: "+num);
		
	}

}
