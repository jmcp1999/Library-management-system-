package com.biblioteca;

import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Admin admin = new Admin("Admin");

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book by Title");
            System.out.println("3. Search Book by Author");
            System.out.println("4. Search Book by Genre");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book genre: ");
                    String genre = scanner.nextLine();
                    admin.addBook(library, new Book(title, author, genre));
                    break;

                    case 2:
                    System.out.print("Enter book title to search: ");
                    title = scanner.nextLine();
                    List<Book> booksByTitle = library.searchByTitle(title);
                    if (booksByTitle.isEmpty()) {
                        System.out.println("No books found with title: " + title);
                    } else {
                        booksByTitle.forEach(System.out::println);
                    }
                    break;
  
                    
                    case 3:
                    System.out.print("Enter author to search: ");
                    author = scanner.nextLine();
                    List<Book> booksByAuthor = library.searchByAuthor(author);
                    if (booksByAuthor.isEmpty()) {
                        System.out.println("No books found by author: " + author);
                    } else {
                        booksByAuthor.forEach(System.out::println);
                    }
                    break;

                    case 4:
                    System.out.print("Enter genre to search: ");
                    genre = scanner.nextLine();
                    List<Book> booksByGenre = library.searchByGenre(genre);
                    if (booksByGenre.isEmpty()) {
                        System.out.println("No books found with genre: " + genre);
                    } else {
                        booksByGenre.forEach(System.out::println);
                    }
                    break;

                    case 5:
                    System.out.print("Enter your name: ");
                    String userName = scanner.nextLine();
                    User user = library.findUser(userName);
                    if (user == null) {
                        user = new User(userName);
                        library.addUser(user);
                    }
                    System.out.print("Enter book title to borrow: ");
                    title = scanner.nextLine();
                    List<Book> booksToBorrow = library.searchByTitle(title);
                    if (booksToBorrow.isEmpty()) {
                        System.out.println("No books found with title: " + title);
                    } else {
                        user.borrowBook(booksToBorrow.get(0));
                    }
                    break;

    