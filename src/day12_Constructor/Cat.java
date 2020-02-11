package day12_Constructor;

 class Cat {
	
	String gender;
	String breed;
	int age;
	String color;
	
	 Cat(String g, String b, int a){
		gender=g;
		breed=b;
		age = a;
	}
	 Cat(String g, String b){
		gender = g;
		breed = b;
	}
	
	 void eat() {
		System.out.println("Cat eating");
	
	}

	
}
