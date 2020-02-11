package oop_Abstr_Polymorf;

public abstract class ChairV {
	
	String model;
	int weight;

	public abstract void sit();
	abstract void stepOnIt();
	
	
	
	/*
	 * CHICAGO BATCH 10 - Abstraction Task 
	 * 
	 * 1.Create abstract class Chair. 
	 * Instance variables: model, weight. Create abstract methods: void sit, void stepOnIt
	 * 
	 * 2. Create non-abstract class Aeron. Extend to Chair and implement abstract methods. 
	 * Simply print “sitting on Aeron chair” and “stepping on Aeron char”
	 * 
	 * 3. Create non-abstract class Humanscale. Extend to Chairand implement abstract methods. 
	 * Simply print “sitting on Humanscale chair” and “stepping on Humanscale chair”
	 * 
	 * 4. Create Interface Rollable. Declare 2 abstract methods.
	 * Void rollBack,  void rollForward.
	 * 
	 * 5. Create Interface Collapsible. Declare 4 abstract methods:
	 * Void lock, void unlock, void fold, void unfold. 
	 * 
	 * 6. Implement Rollable in Aeron class. 
	 * 
	 * 7. Implement both Rollable and Collapsible in Humanscaleclass.
	 * 
	 */
}
