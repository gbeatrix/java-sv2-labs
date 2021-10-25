package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        new Book();

        System.out.println("new Book(): " + new Book());

        Book emptyBook;
        // System.out.println(emptyBook); // java: variable emptyBook might not have been initialized
        emptyBook = null;
        System.out.println("emptyBook: " + emptyBook);
        System.out.println("A változóhoz " + ((emptyBook==null)?"még nincs":"már van") + " példány rendelve.");

        Book book = new Book();
        System.out.println("book = new Book(): " + book);
        book = null;
        System.out.println("book = null: " + book);
        book = new Book();
        System.out.println("book = new Book(): " + book);

        Book anotherBook = new Book();
        System.out.println("book == anotherBook: " + (book == anotherBook));
        anotherBook = book;
        System.out.println("anotherBook: " + anotherBook);
        System.out.println("book == anotherBook: " + (book == anotherBook));

        Book[] books = {book, new Book(), new Book()};
        List<Book> bookList = Arrays.asList(books);
        List<Book> bookShelf = new ArrayList<>();
        for(Book b : bookList){
            bookShelf.add(b);
        }
        System.out.println(Arrays.toString(books));
        System.out.println(bookList);
        System.out.println(bookShelf);
    }
}
