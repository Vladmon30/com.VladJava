package oop_Inherit;

public class Vehicle {

	String make;
	int year;
	int maxSpeed;
	int milage;
	
	public void drive(){
		System.out.println("Driving a vehicle");
	}
	
	public void stop() {
		System.out.println("Stop driving");
	}
	
	public void needService() {
		System.out.println("You must service your vehicle");
	}
	
	
}
