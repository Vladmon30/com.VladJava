package day11_CustomClas;

public class MobileFactory {
	public static void main(String[] args) {
		
	
	
	Mobile phone1 = new Mobile();
	
		phone1.brand = "Samsung";
		phone1.model = "S10";
		phone1.price = 1000;
		
	Mobile phone2 = new Mobile();
		phone2.brand = "Apple";
		phone2.model = "11";
		phone2.price = 1100;
		
	
		phone1.call();
		phone1.text();
	
	int totalPrice = phone1.price+phone2.price;
	System.out.println("total price is : " + totalPrice);

	
	}
}
