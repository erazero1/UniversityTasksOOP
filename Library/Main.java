package OOP.Library;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Animal Farm");
        Book book1 = new Book("Ice And Fire");
        Book book2 = new Book("Hunter");
        Reader reader = new Reader("Petrov");
        reader.takeBook(3);
        reader.takeBook("Animal Farm", "Ice And Fire", "Hunter");
        reader.takeBook(book, book1, book2);
        reader.returnBook(3);
        reader.returnBook("Animal Farm", "Ice And Fire", "Hunter");
        reader.returnBook(book, book1, book2);

    }
}
