package day04_MethodTrain;

public class MethodCreation {

	public static void main(String[] args) {
		
	
		cook("Steak");
		youWillNeed("Meat, Oil, Salt, pepper, Wooden Spoon, tomato, onions, garlic rosemary");
		cookFor(10, "Grilling");
		ready();

}
	private static void cook(String foodName) {
		/*
		 * method cook accepts String food name, and prints
		 * "Today we are cooking foodName."
		 */
		
		System.out.println("Today we are cooking: " + foodName);
		
		
	}
	/*
	 * method youWillNeed, accepts a String with things we need
	 * prints "We need following items: items"
	 */
	
	private static void youWillNeed(String items) {
		
		
		System.out.println("We need following items: " + items + ".");
		
	}
	
	/*
	 * method cookFor accepts minutes and way of cooking and prints:
	 *"You need to cook for minutes by wayOfCooking
	 * 
	 */
	
	private static void cookFor(int min, String wayOfCooking) {
		/*
		 * method cookFor accepts minutes and way of cooking and prints:
		 *"You need to cook for minutes by wayOfCooking
		 * 
		 */
		System.out.println("You need to cook for " + min+ " by " +wayOfCooking+ ".");
		
	}
	
	/*
	 * method ready, does not accept any parameters,
	 * prints : Meal is ready! Enjoy!
	 * 
	 */
	private static void ready() {
		
		System.out.println("Meal is ready! Enjoy!");
		
		
	}
}