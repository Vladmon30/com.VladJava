package day14_Final_Super_Abstract_Examples;

public class ProductTest {
public static void main(String[] args) {
	
	Model mod = new Model();
		System.out.println(mod.toSt());
		mod.buy();
	Product pr = new Product();
		System.out.println(pr.toSt());
		pr.buy();
		
	System.out.println(mod.IS_Available);
	System.out.println(pr.IS_Available);
}
}
