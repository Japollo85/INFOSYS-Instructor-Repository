package net.mercy.strings;

public class App {
	
	
	public static void main(String[] args) {
		Book book = new Book();
		book.setAuthor("Hello");
		book.setName("Titanic");
		
		System.out.println(book.toString());
	}

}
