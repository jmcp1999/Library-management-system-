package com.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Book> borrowedBooks;

    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        if (!book.isBorrowed()) {
            book.borrow();
            borrowedBooks.add(book);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println("Book not found in borrowed books.");
        }
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
