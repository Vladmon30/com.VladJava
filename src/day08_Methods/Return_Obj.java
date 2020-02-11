package day08_Methods;

public class Return_Obj {
public static void main(String[] args) {
	int k=2;
	int t=3;
	int res =  multiply(k,t);
	System.out.println(res);
}

private static int multiply(int n, int c) {
	
	int num = n*c;
	return num;
}

	
	
}
