package oop_Inherit;

public class Transpoartation {

	public static void main(String[] args) {
		
	Vehicle v  = new Vehicle();
			v.make = "Lexus";
			v.year = 2015;
			v.maxSpeed = 220;
			v.milage = 300;
		  v.drive();
		  v.stop();
		  v.needService();
	//	  v.deliveryPrice();  -- not working
		  	  
	Car c = new Car();    // Car --> Vehicle
		c.make = "toyota";
		c.year = 2016;
		c.maxSpeed = 200;
		c.milage = 400;
		c.deliveryPrice= "$300";
//		c.cargoWeight =100;   -- not working car --> vehicle
	c.drive();
	c.stop();
    c.needService();
    c.doUber();

    
	Truck t = new Truck();   // Truck --> Vehicle
		  t.make = "Volvo";
		  t.year = 2014;
		  t.maxSpeed = 160;
		  t.milage = 1000;
		  t.cargoWeight = 10000;
	t.drive();
	t.doDelivery();
//	t.doUber();  -- not working   truck --> vehicle
		 
	
	Boat b = new Boat();    // Boat --> Car --> Vehicle (can do all what Car can do and Vehicle)
		 b.make = "Fourwings";
		 b.year = 2010;
		 b.maxSpeed = 30;
		 b.milage = 200;
		 b.copacityOfPassangers = 4;
		 b.deliveryPrice = "$100";
		 b.waterDrive = true;
	 b.doUber();
	 b.drive();
	 b.stop();
	}

}
