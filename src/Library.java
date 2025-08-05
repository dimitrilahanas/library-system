public class Library {
    public static void main(String[] args) {
        Books BookSystem = new Books();

        System.out.println(BookSystem.addBook());
        System.out.println(BookSystem.getBooks());
    }
}
