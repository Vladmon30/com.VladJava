package day12_Constructor;

public class CatOwner {
	public static void main(String[] args) {
		Cat a = new Cat("mail", "chihahya");
			a.eat();
			//a.age = 5;
			a.color = "brown";
			System.out.println(a.gender);
			System.out.println(a.breed);
			System.out.println(a.age);
			System.out.println(a.color);
	}
}
