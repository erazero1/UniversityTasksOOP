package OOP.Library;

public class Reader {
    private String FULL_NAME;
    private int id;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public Reader(String FULL_NAME) {
        this.FULL_NAME = FULL_NAME;
    }


    void takeBook(int amount) {
        System.out.println(FULL_NAME + " took " + amount + " books");
    }

    void takeBook(String... title) {
        System.out.println(FULL_NAME + " took books: ");
        for (String s : title) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }

    void takeBook(Book... book) {
        System.out.println(FULL_NAME + " took books: ");
        for (Book b : book) {
            System.out.print(b.getName() + ", ");
        }
        System.out.println();
    }

    void returnBook(int amount) {
        System.out.println(FULL_NAME + " returned " + amount + " books");
    }

    void returnBook(String... title) {
        System.out.println(FULL_NAME + " returned books: ");
        for (String s : title) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }

    void returnBook(Book... book) {
        System.out.println(FULL_NAME + " returned books: ");
        for (Book b : book) {
            System.out.print(b.getName() + ", ");
        }
        System.out.println();
    }


}
