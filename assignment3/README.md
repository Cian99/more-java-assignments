# Book Management System

## Project Overview
This project implements a book management system using Java, demonstrating object-oriented programming principles, file I/O operations, and the use of priority queues. It allows users to add books to a file, read books from the file, and display them sorted by rating.

## Key Components

1. `Book` (Class):
   - Represents individual books in the system
   - Implements Comparable interface for priority queue ordering
   - Contains properties like title, author, category, and rating
   - Overrides compareTo() method for custom priority ordering based on rating

2. `WriteBooks` (Class):
   - Handles the process of adding new books to the file
   - Provides a user interface for inputting book details
   - Uses FileWriter to append book information to a text file

3. `ReadBooks` (Class):
   - Reads book information from the file
   - Creates Book objects and adds them to a PriorityQueue
   - Displays the books sorted by rating

## Key Features
- File I/O operations for persistent storage of book information
- Priority queue implementation for efficient sorting of books by rating
- Custom comparator in Book class for rating-based prioritization
- User interface for adding new books to the system
- Reading and displaying books sorted by rating
- Use of tab-delimited format for storing book information

## Project Structure
- `Book.java`: Defines the Book class with necessary attributes and methods
- `WriteBooks.java`: Handles user input and writing book information to a file
- `ReadBooks.java`: Reads book information from the file and displays sorted results

## Functionality
- Add new books to the system with details (title, author, category, rating)
- Store book information in a tab-delimited text file
- Read book information from the file
- Display books sorted by rating (highest to lowest)
- Simple command-line interface for user interaction

This project serves as a practical example of file handling, priority queues, and basic CRUD (Create, Read) operations in Java. It demonstrates how to manage a collection of books, persist data to a file, and retrieve and sort the data based on user ratings.