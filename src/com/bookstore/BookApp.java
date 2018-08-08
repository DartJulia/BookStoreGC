package com.bookstore;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<>();
		// Calling inventory method that stores arraylist elements and initial user
		// welcome strings
		inventory(books);

		//Printing array list through loop, and printing with toString format method
		printArray(books);

		// Adding books section of application
		System.out.println("Would you like to add a book? (yes/no) ");
		String userChoice = scan.nextLine();
		while (userChoice.equalsIgnoreCase("yes")) {
		if (userChoice.equalsIgnoreCase("yes")) {
				// Validate isbn is correct length
			String userIsbn = Validator.getString(scan, "Please enter in a book ISBN: ");
			System.out.println("Please enter in a book author: ");
			String userAuthor = scan.nextLine();
			System.out.println("Please enter in a book title: ");
			String userTitle = scan.nextLine();
			System.out.println("Please enter in a suggested price: ");
			double userPrice = scan.nextDouble();
				scan.nextLine(); // garbage line
				// create new book abject from user input and add to books array list
			books.add(new Book(userIsbn, userAuthor, userTitle, userPrice));
			printArray(books);
			System.out.println();
			System.out.println("Good addition! Thanks!");
				System.out.println("Would you like to add another book?(yes/no) ");
				userChoice = scan.nextLine();
		}

		}
		// Buy books section of application
		System.out.println("Okay, would you like to buy a book? (yes/no) ");
		String userChoice2 = scan.nextLine();
		while (userChoice2.equalsIgnoreCase("yes")) {
			printArray(books);
			System.out.println("Enter the number book you'd like: ");
			int userNum = scan.nextInt();
			scan.nextLine(); // garbage line
			// remove book once it is chosen
			books.remove(userNum - 1);
			System.out.println("Great, your book will arrive in 3-5 business days!");
			System.out.println();
			printArray(books);
			System.out.println();
			System.out.println("Would you like to buy another book? (yes/no) ");
			userChoice2 = scan.nextLine();
		}
		
		System.out.println("Okay have a great day!");

	}

	public static void printArray(ArrayList<Book> books) {
		int counter = 1;
		System.out.println(
				String.format("%-10s %-25s %-25s %-20s %-10s", "ISBN", "Author", "Title", "Price $", "Condition"));
		for (Book b : books) {
		System.out.println(counter + ". " + b);
		counter++;
		}

	}

	public static void inventory(ArrayList<Book> books) {
		books.add(new Book("2345", "Herman Melville", "Moby Dick", 24.00));
		books.add(new UsedBook("2567", "F. Scott Fitzgerald", "The Great Gatsby", 7.99, "Like new"));
		books.add(new Book("2662", "William Shakespeare", "Hamlet", 18.99));
		books.add(new UsedBook("3457", "J.R.R. Tolkien", "The Hobbit", 5.99, "Fair"));
		books.add(new Book("2577", "Emily Bronte", "Wuthering Heights", 14.99));
		books.add(new UsedBook("2662", "Jane Austen", "Pride and Prejudice", 4.99, "Acceptable"));
		books.add(new Book("2341", "Leo Toloy", "War and Peace", 15.00));
		books.add(new Book("2662", "Jane Austen", "Sense and Sensibility", 16.99));

		System.out.println("Welcome to the classic book bookstore");
		System.out.println("Here is your initial menu of books: ");
		System.out.println();

	}
}
