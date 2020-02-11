package oop_Encapsulat;

public class LibraryVlad {
	public static void main(String[] args) {
		
		BooksVlad book1 =new BooksVlad();
			book1.setAuthor("Tom Hardy");
			book1.setTitle("Roman");
			book1.setPages(10);
		
		BooksVlad book2 =new BooksVlad();
			book2.setAuthor("Vlad Mon");
			book2.setTitle("Pro Lubov");
			book2.setPages(5);

			
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthor());
		System.out.println(book1.getPages());
// 
		System.out.println("-----------------");
		System.out.println(book2.getTitle());
		System.out.println(book2.getAuthor());
		System.out.println(book2.getPages());
	}
}
