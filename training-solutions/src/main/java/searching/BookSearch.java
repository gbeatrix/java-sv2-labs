package searching;

import java.util.*;

public class BookSearch {
    private List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = new ArrayList<>(books);
        Collections.sort(this.books);
    }

    public Book findBookByAuthorTitle(String author, String title) {
        validateStringArgument(author);
        validateStringArgument(title);
        int index = Collections.binarySearch(books, new Book(author, title));
        if (index >= 0) {
            return books.get(index);
        } else {
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        }
    }

    private void validateStringArgument(String argument) {
        if (argument == null || argument.isBlank()) {
            throw new IllegalArgumentException("Author or title must not be empty!");
        }
    }
}
