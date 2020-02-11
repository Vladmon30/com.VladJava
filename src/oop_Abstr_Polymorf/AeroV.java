package oop_Abstr_Polymorf;

public class AeroV extends ChairV implements RollableV {

	@Override
	public void sit() {
		System.out.println("Siting on Aero Chair");	
	}

	@Override
	void stepOnIt() {
		System.out.println("Steping on Aero Chair");			
	}

	@Override
	public void rollBack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rollForward() {
		// TODO Auto-generated method stub
		
	}
}
