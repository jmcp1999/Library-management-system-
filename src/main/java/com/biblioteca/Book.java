package com.biblioteca;

public class Book {
    private String title;
    private String author;
    private String genre;
    private boolean borrowed;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrow() {
        this.borrowed = true;
    }

    public void returnBook() {
        this.borrowed = false;
    }

    
    public String toString() {
        return "Book [Title=" + title + ", Author=" + author + ", Genre=" + genre + ", Borrowed=" + borrowed + "]";
    }
}
