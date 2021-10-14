package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Donald E. Knuth", "A számítógép-programozás művészete");

        book.register("9789638794703");

        System.out.println("szerző: " + book.getAuthor());
        System.out.println("cím: " + book.getTitle());
        System.out.println("reg. szám: " + book.getRegNumber());
    }
}
