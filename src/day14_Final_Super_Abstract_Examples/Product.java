package day14_Final_Super_Abstract_Examples;

public class Product extends Model {
	private int price;
	
	public Product(String name, int price) {
		super(name);
		this.price = price;
	}
	
	public Product() {
		super("Product 101");
		
	}
	
	
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
	
	
}
