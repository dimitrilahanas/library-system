import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private boolean borrowed;

    Scanner sc = new Scanner(System.in);

    public Book() {
        this.title = "";
        this.author = "";
        this.borrowed = false;
    }

    public Book(String title, String author, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "\nTitle: " + title + "\nAuthor: " + author + "\nBorrowed: " + borrowed;
    }

    public void createBook() {
        Library lib = new Library();
        try {
            FileWriter fw = new FileWriter("database/books.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            
            System.out.print("Book Name: ");
            title = sc.next();
            System.out.print("Author: ");
            author = sc.next();
            borrowed = false;

            System.out.println(title + " " + author + " has been added to the library!");
            
            Book bookEntry = new Book(title, author, borrowed);
            
            pw.println(bookEntry.toString());
            pw.close();
        } 

        catch (FileNotFoundException e) {
            System.err.println("File not found. (books.txt)");
        } catch (IOException e) {
            e.printStackTrace();
        }

        lib.exit();

    }
}