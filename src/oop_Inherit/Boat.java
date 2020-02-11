package oop_Inherit;

public class Boat extends Car{
	boolean waterDrive = true;
	int copacityOfPassangers;
	
	void passangers() {
		System.out.println("You can swim with 4 passangeer");
		copacityOfPassangers = 4;
	}
}
