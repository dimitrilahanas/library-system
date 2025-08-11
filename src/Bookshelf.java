import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Bookshelf {

    Scanner input = new Scanner(System.in);
    File books = new File("database/books.txt");
    
    public void allBooks() {
        Library lib = new Library();
        try {
            Scanner sc = new Scanner(books);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found! (books.txt)");
        }

        lib.exit();
    }

    public void searchBook() {
        Library lib = new Library();

        System.out.print("Enter Book Name: ");
        String targetBook = input.nextLine();
        try {
            Scanner sc = new Scanner(books);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.contains(targetBook)) {
                    System.out.println("True");
                }
                else {
                    System.out.println("False");
                }
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found! (books.txt)");
        }

        lib.exit();
    }

}