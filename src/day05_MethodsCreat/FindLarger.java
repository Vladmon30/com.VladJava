package day05_MethodsCreat;

public class FindLarger {
	public static void main(String[] args) {
		int [] nums = {10, 20, 30, 1};
		getLarger(nums);
		
	}

	private static void getLarger(int [] n) {
			
//		for(int i = 0; i>=n.length-1;i++) {
//			if(n[i]>n[i+1]) {
//				System.out.println(n[i]);
		
			int larger = n[0];
			
			for(int nu:n) {
				if(nu>larger) {
					larger = nu;
				}
			}
			System.out.println(larger);
	}
}
