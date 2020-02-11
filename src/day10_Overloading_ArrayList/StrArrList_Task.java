package day10_Overloading_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class StrArrList_Task {

	public static void main(String[] args) {

		ArrayList <String> names = new ArrayList<>();

			names.add("Vlad");
			names.add("Maryna");
			names.add("Denys");
			names.add("Polina");
			
			System.out.print(names);  //Vlad, Maryna, Denys, Polina
			System.out.println();	  //5
			names.add("Alex");
			System.out.println("All names: " + names);
			
			System.out.println("Numbers of names: " + names.size());
				
			System.out.println("first person name " + names.get(0));  //read first person name
			
			//read last person name
			String lastName = names.get(names.size()-1);
			System.out.println("last person name " + lastName);      // Alex
			
			
			Collections.sort(names);
			System.out.println(names);
			}
		
	}

