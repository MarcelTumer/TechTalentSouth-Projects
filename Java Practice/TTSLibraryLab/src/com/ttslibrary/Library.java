package com.ttslibrary;

import java.util.ArrayList;

public class Library<borrowed> extends Book{
    // Add the missing implementation to this class
    private String address;
    ArrayList<Object> libraryBooks = new ArrayList<Object>();
    private Object Book;

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
    public Library(String libraryAddress) {
        this.address = libraryAddress;
    }
    public void addBook(Book Book){
        this.libraryBooks.add(Book);
    }
    public void borrowBook(String title) {
        boolean[] isInCatalog = new boolean[1];
        this.libraryBooks.add(Book);
        }

        public void returnBook(String title) {
            for (Book: this.libraryBooks){
                if (title.equals(title)) {
                    borrowed = false;
                    System.out.println(title + " has been returned.");
                }
            }
        }
        if(!borrowed) {
        System.out.println(title + " is not in our catalog");
    }

    public void printAvailableBooks() {
        if (libraryBooks.isEmpty()) {
            System.out.println("The book you are looking for is currently unavailble.");
        } else {
            ArrayList<String> availableBooks = new ArrayList<>();
            libraryBooks.forEach(n -> {
                if (!borrowed) availableBooks.add(new.Title);
            });
            System.out.println(availableBooks);
        }
        ;
    }

    public static void printOpeningHours() {
        System.out.println("The library hours are from 10am-7pm Monday-Friday and 10am-5pm on Saturdays. The library is closed on Sundays.");
    }

    public void printAddress() {
        System.out.println(this.address);
    }
    }

