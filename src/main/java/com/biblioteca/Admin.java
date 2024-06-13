package com.biblioteca;

public class Admin extends User {

    public Admin(String name) {
        super(name);
    }

    public void addBook(Library library, Book book) {
        library.addBook(book);
        System.out.println("Admin " + getName() + " has added the book: " + book.getTitle());
    }

    public void manageLoans() {
        System.out.println("Managing loans...");
        
    }
}
