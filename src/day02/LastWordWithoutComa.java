package day02;

public class LastWordWithoutComa {

	public static void main(String[] args) {
		
		/* print all items in string coma separate, but last one without coma
		 * <<<<Vlad, Maryna, Denys, Polina>>>>
		 */
//		if(i == itemsCount) {
//			allItems = allItems + item;
//		}else {
//			allItems = allItems + item + ",";
//		}
		
		String [] names = {"Vlad", "Maryna", "Denys", "Polina"};
		String last = names[3];
		System.out.println(last);
		System.out.println("=====");
			for(String name:names) {
				if(name == last) {
					System.out.print(name+ ". ");
				}else {
					System.out.print(name+", ");	
}}}}
