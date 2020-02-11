package oop_Abstr_Polymorf;

public class HumanScaleV extends ChairV implements CollapsibleV {

	@Override
	public void sit() {
	System.out.println("Siting on HumanScale chair");
	}
	@Override
	void stepOnIt() {
		System.out.println("Steping on HumanScale chair");		
	}
	@Override
	public void lock() {
		System.out.println("HumanScale chair is locked");
		
	}
	@Override
	public void unlock() {
		System.out.println("HumanScale chair is unlocked");
		
	}
	@Override
	public void fold() {
		System.out.println("HumanScale chair is fold");
		
	}
	@Override
	public void unfold() {
		System.out.println("HumanScale chair is unfold");
		
	}

}
