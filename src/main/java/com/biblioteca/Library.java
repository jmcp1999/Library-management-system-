package com.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> catalog;
    private List<User> users;

    public Library() {
        this.catalog = new ArrayList<>();
        this.users = new ArrayList<>();
    
        addPreAddedBooks();
    }

    private void addPreAddedBooks() {
        catalog.add(new Book("Don Quixote", "Miguel de Cervantes", "Classic"));
        catalog.add(new Book("Harry Potter and the Philoshopher's stone", "J.K. Rowling", "Fantasy"));
        catalog.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic"));
        catalog.add(new Book("The Final Empire", "Brandon Sanderson", "Fantasy"));
        catalog.add(new Book("The Fellowship of the Ring", "J.R.R Tolkien", "Fantasy"));
        catalog.add(new Book("Lazarillo de Tormes", "Unknown", "Classic"));
        catalog.add(new Book("Berserk Vol.1", "Kentaro Miura", "Manga"));
        catalog.add(new Book("Naruto Vol.1", "Masashi Kishimoto", "Manga"));
        catalog.add(new Book("Dragon Ball Vol.1", "Akira Toriyama", "Manga"));
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User findUser(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

    public List<Book> searchByTitle(String title) {
        List<Book> results = new ArrayList<>();
        for (Book book : catalog) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> results = new ArrayList<>();
        for (Book book : catalog) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> searchByGenre(String genre) {
        List<Book> results = new ArrayList<>();
        for (Book book : catalog) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> getCatalog() {
        return catalog;
    }

    public List<User> getUsers() {
        return users;
    }
}