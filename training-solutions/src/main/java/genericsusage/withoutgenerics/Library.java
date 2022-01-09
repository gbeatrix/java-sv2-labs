package genericsusage.withoutgenerics;

import genericsusage.Book;

import java.util.List;

public class Library {
    public Book getFirstBook(List books) {
        if (books == null) {
            throw new NullPointerException("Argument should not be null!");
        } else if (books.isEmpty()) {
            throw new IllegalArgumentException("Argument should not be empty!");
        }
        Object firstobj = books.get(0);
        try {
            return (Book) firstobj;
        } catch (ClassCastException e) {
            throw new ClassCastException("Not a book");
        }
    }
}
