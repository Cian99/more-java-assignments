package assignment3;

public class Book implements Comparable<Book> {
	
	private String title;
	private String author;
	private String category;
	private int rating; // from 0 (rotten) to 5 (great)
	
	// constructors
	public Book(String title, String author, String category, int rating) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.rating = rating;
	}
	public Book() {
		this(null, null, null, 0);
	}
	
	// getter and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	// compare the books by rating
	public int compareTo(Book b) {
		
		if(this.getRating() < b.getRating()) return 1;
		else if(this.getRating() > b.getRating()) return -1;
		else return 0;
		
	}
	
	// format book info
	@Override
	public String toString() {
		return String.format("%d\t%s\t%s\t%s", getRating(), getTitle(), getAuthor(), getCategory());
	}

}
