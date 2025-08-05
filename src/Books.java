import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    Scanner sc = new Scanner(System.in);
    private ArrayList<ArrayList<String>> bookList = new ArrayList<>();

    public String addBook() {
        System.out.print("Book Name: ");
        String BookName = sc.next();

        System.out.print("Author: ");
        String Author = sc.next();

        ArrayList<String> bookEntry = new ArrayList<>();
        bookEntry.add(BookName);
        bookEntry.add(Author);
        bookList.add(bookEntry);

        return (BookName + " " + Author + " has been added to the library!");
    }

    public String getBooks() {
        StringBuilder result = new StringBuilder();
        for (ArrayList<String> book : bookList) {
            result.append(book.get(0) + " " + book.get(1));
        }
        return result.toString();
    }
}