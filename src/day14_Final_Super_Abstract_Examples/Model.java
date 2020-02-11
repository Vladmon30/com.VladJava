package day14_Final_Super_Abstract_Examples;

public class Model {
	private String name;
	int hour;
	public static final boolean IS_Available = true;
	
		public  Model() {
			this("Model 101");
			
	}
		public Model(String name) {
			this.name = name;
			
	}
		
public String getName() {
	return name;
	}
public void setName(String name) {
	this.name = name;
	}
		
	public String toSt() {
		return "Name is:" + name;
	}
	
	public void buy() {
		System.out.println("Buy some: " + name);
	}
		
}
	