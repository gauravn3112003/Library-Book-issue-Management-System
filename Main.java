// Main .java 
import java.util.*;
import Library.*;
public class Main extends Library {
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
