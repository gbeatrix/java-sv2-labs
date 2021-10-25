package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("The Art of Computer Programming");
        System.out.println(book.getTitle());
        book.setTitle("A számítógép-programozás művészete");
        System.out.println(book.getTitle());
    }
}
