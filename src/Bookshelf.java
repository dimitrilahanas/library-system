import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Bookshelf {

    public void allBooks() {
        Library lib = new Library();
        try {
            File books = new File("database/books.txt");
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

}