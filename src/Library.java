import java.util.Scanner;

public class Library {

    Scanner sc = new Scanner(System.in);

    public void commandList() {
        String[] commands = {
            "1 - getBooks",
            "2 - addBook",
            "3 - searchBook"
        };

        System.out.println("Supported Commands:");
        for (String command : commands) {
            System.out.println(command);
        }
        commandSelector();
    }

    public void commandSelector() {
        Book book = new Book();
        Bookshelf bookShelf = new Bookshelf();
        System.out.print("Select a command (1, 2...): ");
        int command = sc.nextInt();

        switch (command) {
            case 1:
                bookShelf.allBooks();
                break;
            case 2:
                book.createBook();
                break;
            case 3:
                bookShelf.searchBook();
            default:
                System.out.println("Invalid Command.");
                commandSelector();

        }
    }

    public void exit() {
        System.out.println("Type 'exit' to quit, press enter to continue.");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting system...");
                System.exit(0);
            }
    }

    public void run() {
        System.out.println("Welcome to the Library System!");

        while (true) {
            commandList();
            commandSelector();
            exit();
        }
    }

    public static void main(String[] args) {
        new Library().run();
    }
}
