package day10_Overloading_ArrayList;

public class WarmUpTask {

	public static void main(String[] args) {
		
		
		/*
		 * Method: work
		 * 		1. params: string. JobType
		 * 		   returns boolean. if job is sdet or developer, then true, else false
		 * 		   prints: working as <JobType> and it is fun
		 */
		boolean j = work("sDet");
		System.out.println(j);
		
		double w = work(8);
		System.out.println(w);
		
	}		
			public static boolean work (String jobType) {
				
				if(jobType.equalsIgnoreCase("sdet")||jobType.equalsIgnoreCase("developer")) {
					
					System.out.println("Working as "+jobType+ " and its fun");
					return true;
				}else {			
					System.out.println("Ooops mistake");
					return false;
				}			
			}
			
			/*        Method: work
			 *     2. params: int.  -> hours
			 * 		  returns double -> salary = hours * 60
			 * 		  prints: Worked <this many> hours and made <that much> income
			 */
			 
			public static double work(int hours ) {
				
				double salary= hours*60;
				
				System.out.println("Worked " + hours + " hours and made " + salary + " income ");
				return salary;
				
			}
			
			
	}


