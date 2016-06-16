package net.mercy.constructors;

public class Books {
	
	private int numberOfPages;
	private Author author;
	private String title;
	
	
	public void getNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}


	public void getAuthor(Author author) {
		this.author = author;
	}


	public void getTitle(String title) {
		this.title = title;
	}


	
	
	
	public Books(int numberOfPages, Author author, String title){
		this.numberOfPages = numberOfPages;
		this.author = author;
		this.title = title;
	}
	

}
