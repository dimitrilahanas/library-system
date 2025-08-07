import java.util.Scanner;

public class Library {

    Scanner sc = new Scanner(System.in);

    public void commandList() {
        String[] commands = {
            "1 - getBooks",
            "2 - addBook"
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
            default:
                System.out.println("Invalid Command.");
                commandSelector();

        }
    }

    public void run() {
        System.out.println("Welcome to the Library System!");

        while (true) {
            commandList();
            commandSelector();

            System.out.println("Type 'exit' to quit, press enter to continue.");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting system...");
                break;
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        new Library().run();
    }
}
