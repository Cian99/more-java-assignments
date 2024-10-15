package assignment3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class WriteBooks {

	public static void main(String[] args) throws IOException {
		
		// scanner for data input
		Scanner input = new Scanner(System.in);
		Scanner int_input = new Scanner(System.in);
		
		// when exiting the program exit will be changed to true
		boolean exit = false;
		
		// separate the data in the file
		String ls = System.lineSeparator();
		
		// find the file to read
		FileWriter f = new FileWriter("c:\\users\\leahy\\book.txt", true);
		
		Formatter output = new Formatter(f);
		
		while(exit == false) {
			 
			// ask user what to do 
			System.out.println("Enter 1 to input, 0 to exit");
			String choice = input.nextLine();
			
			if(choice.equals("1")) {
				
				// get the book data / info
				String outString, title, author, category;
				int rating;
				
				System.out.println("Enter Title: ");
				title = input.nextLine();
				System.out.println("Enter Author: ");
				author = input.nextLine();
				System.out.println("Enter Category: ");
				category = input.nextLine();
				System.out.println("Enter Your Rating: ");
				rating = int_input.nextInt();
				
				// format the data
				outString = String.format("%s\t%s\t%s\t%d", title, author, category, rating);
				// add to the file
				f.append(outString);f.append(ls);
				
			}
			else if(choice.equals("0")) {
				exit = true;
				System.out.println("\nExit!");
			}
			
			
		}
		
		f.close();
		input.close();
		int_input.close();
		
		output.close();

	}

}
