import java.util.*;

class Library {

  Date d1 = new Date();

  String[] books, authors,dates;
  int no_of_books;

  Library() {
    this.books = new String[100];
    this.dates = new String[100];

    this.authors = new String[100];

    this.no_of_books = 0;
  }

  void addBook(String book, String author) {
    this.books[no_of_books] = book;
    this.authors[no_of_books] = author;
    this.dates[no_of_books] = d1.toString();
    no_of_books++;
    System.out.println(book + " has been added!");
    System.out.println();
  }

  void showAvailableBooks() {
    System.out.println("Available Books are:");
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i] == null) {
        continue;
      }
      System.out.println("- Book Name : " + this.books[i]);
      System.out.println("- Author Name : " + this.authors[i]);
      System.out.println("- Date : " + this.dates[i]);
      System.out.println();

    }
  }

  void issueBook(String book) {
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].equals(book)) {
        System.out.println("The book has been issued!");
        this.books[i] = null;
        return;
      }
    }
    System.out.println("This book does not exist");
  }

  void returnBook(String book, String author) {
    addBook(book, author);
    System.out.println();
  }
}

public class Main {

  public static void main(String[] args) {
    int ch;
    String bName, bAuthor;
    Scanner sc = new Scanner(System.in);

    Library centralLibrary = new Library();
    do {
      System.out.println(
        "1. VIEW BOOKS \n2. ISSUE BOOK \n3. RETURN BOOK \n4. Add Books \n5. Exit "
      );
      System.out.print("Enter the choice : ");
      ch = sc.nextInt();
      System.out.println();

      sc.nextLine();
      switch (ch) {
        case 1:
          centralLibrary.showAvailableBooks();
          break;
        case 2:
          System.out.print("Enter the book Name: ");
          bName = sc.nextLine();
          centralLibrary.issueBook(bName);

          break;
        case 3:
          System.out.print("Enter the book Name: ");
          bName = sc.nextLine();
          System.out.print("Enter Author Name : ");
          bAuthor = sc.nextLine();
          centralLibrary.returnBook(bName, bAuthor);
          break;
        case 4:
          System.out.print("Enter the book Name: ");
          bName = sc.nextLine();
          System.out.print("Enter Author Name : ");
          bAuthor = sc.nextLine();
          centralLibrary.addBook(bName, bAuthor);
          break;
        case 5:
          System.out.println("Exit");
          break;
        default:
          System.out.println("Invalid Selection !");
          break;
      }
    } while (ch != 5);
  }
}
