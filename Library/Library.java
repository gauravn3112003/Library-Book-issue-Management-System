package Library;

public class Library {

 public String[] books;
 public int no_of_books;

  public Library() {
    this.books = new String[100];
    this.no_of_books = 0;
  }

  public void addBook(String book) {
    this.books[no_of_books] = book;
    no_of_books++;
    System.out.println(book + " has been added!");
  }

  public void showAvailableBooks() {
    System.out.println("Available Books are:");
    for (String book : this.books) {
      if (book == null) {
        continue;
      }
      System.out.println("* " + book);
    }
  }

  public void issueBook(String book) {
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].equals(book)) {
        System.out.println("The book has been issued!");
        this.books[i] = null;
        return;
      }
    }
    System.out.println("This book does not exist");
  }

  public void returnBook(String book) {
    addBook(book);
  }
}
