import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    Scanner sc = new Scanner(System.in);
    private ArrayList<ArrayList<String>> bookList = new ArrayList<>();

    public void addBook() {
        System.out.print("Book Name: ");
        String BookName = sc.next();

        System.out.print("Author: ");
        String Author = sc.next();

        ArrayList<String> bookEntry = new ArrayList<>();
        bookEntry.add(BookName);
        bookEntry.add(Author);
        bookList.add(bookEntry);

        System.out.println(BookName + " " + Author + " has been added to the library!");
    }

    public void getBooks() {
        StringBuilder result = new StringBuilder();
        for (ArrayList<String> book : bookList) {
            result.append(book.get(0) + "," + book.get(1));
        }
        System.out.println(result.toString());
    }

    public void commandList() {
        String[] commands = {
            "1 - getBooks",
            "2 - addBook"
        };

        System.out.println("Supported Commands:");
        for (String command : commands) {
            System.out.println(command);
        }
    }

    public void commandSelector() {
        System.out.print("Select a command (1, 2...): ");
        int command = sc.nextInt();

        switch (command) {
            case 1:
                getBooks();
                break;
            case 2:
                addBook();
                break;
            default:
                System.out.println("Invalid Command.");
                commandSelector();

        }
    }

    public void run() {
        System.out.println("Welcome to the Library System!");
        commandList();
        
        while (sc.nextLine() != "exit") {
            commandSelector();
        }
    }
}