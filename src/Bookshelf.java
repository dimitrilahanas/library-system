import java.util.Scanner;

public class Bookshelf {

    // public void getBooks() {
    //     for (ArrayList<String> book : bookList) {
    //         System.out.println(book.get(0) + "," + book.get(1));
    //     }
    // }

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
        Book bookCommands = new Book();
        System.out.print("Select a command (1, 2...): ");
        int command = sc.nextInt();

        switch (command) {
            case 1:
                // bookCommands.getBooks();
                break;
            case 2:
                bookCommands.createBook();
                break;
            default:
                System.out.println("Invalid Command.");
                commandSelector();

        }
    }

    public void run() {
    System.out.println("Welcome to the Library System!");
    commandList();

    while (true) {
        System.out.println("Type 'exit' to quit, press enter to continue.");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("exit")) {
            System.out.println("Exiting system...");
            break;
        }
        else {
            commandSelector();
        }
    }
}
}