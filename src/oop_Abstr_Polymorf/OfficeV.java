package oop_Abstr_Polymorf;

import java.util.ArrayList;
import java.util.List;

public class OfficeV {

	public static void main(String[] args) {
			AeroV ach =new AeroV();
			ach.stepOnIt();
			
			
	// Polimorf Example 
			ChairV a = new AeroV();
			ChairV a2 = new AeroV();
			a.sit();
			a.stepOnIt();
			
			ChairV d = ach;
			d=ach;
			
			ChairV h =new HumanScaleV();
			
			
		List<ChairV> chairs = new ArrayList<>();
			chairs.add(a);
			chairs.add(a2);
			chairs.add(d);
			chairs.add(h);
			for (ChairV c: chairs) {
				c.sit();
			}


			
	}

}
