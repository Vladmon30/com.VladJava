package day10_Overloading_ArrayList;

import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
		
		ArrayList list  = new ArrayList();
		
		list.add("Vlad");
		list.add("Monchanov");
		list.add("August 8");
		list.add(1984);
		
		System.out.println(list); //[Vlad, Monchanov, August 8, 1984]
		list.remove(2);  //remove index number 2
		System.out.println(list); //[Vlad, Monchanov, 1984]
		list.remove("Vlad");
		System.out.println(list);  //[Monchanov, 1984]
		
		

	}

}
