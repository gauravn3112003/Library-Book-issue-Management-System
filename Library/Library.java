// Package Library
package Library;
import java.util.*;

public class Library {
    public String[] books, authors, dates;
    public int no_of_books;

    public Library() {
        this.books = new String[100];
        this.authors = new String[100];
        this.no_of_books = 0;
    }
    public void addBook(String book, String author) {
        this.books[no_of_books] = book;
        this.authors[no_of_books] = author;
        no_of_books++;
        System.out.println(book + " has been added!");
        System.out.println();
    }
    public void showAvailableBooks() {
        System.out.println("Available Books are:");
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                continue;
            }
            System.out.println("- Book ID: " +i+1);
            System.out.println("- Book Name : " + this.books[i]);
            System.out.println("- Author Name : " + this.authors[i]);
            System.out.println();
        }
    }
    public void issueBook(String book) {
        int con =0;
            for (int i = 0; i < this.books.length; i++) {
                if (this.books[i].equals(book)) {
                    System.out.println("The book has been issued!");
                    this.books[i] = null;
                    con =1;
                    return;
                }
            }
            if (con == o) {
                System.out.println("This book does not exist");
            }
    }
    public void returnBook(String book, String author) {
        addBook(book, author);
        System.out.println();
    }
}