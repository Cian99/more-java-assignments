package assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ReadBooks {

	public static void main(String[] args) throws IOException {
		
		// create the priotity queue
		PriorityQueue<Book> bookPriorityQueue = new PriorityQueue<>();
		
		// read the file
		BufferedReader br = new BufferedReader(new FileReader("c:\\users\\leahy\\book.txt"));
		String line;
		while((line = br.readLine()) != null) {
			
			// separate data using tab delimiter
			String s[] = line.split("\t");
			
			// create new book object and add it 
			// with its info to the priority queue
			Book b = new Book();
			b.setTitle(s[0]);
			b.setAuthor(s[1]);
			b.setCategory(s[2]);
			int rating = Integer.parseInt(s[3]);
			b.setRating(rating);
			
			bookPriorityQueue.add(b);
			
		}
		
		System.out.println("Rating\tTitle\tAuthor\tCategory");
		br.close();
		
		Iterator<Book> itr = bookPriorityQueue.iterator();
		
		// use an iterator to print the priority queue in order of rating
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		

	}

}
