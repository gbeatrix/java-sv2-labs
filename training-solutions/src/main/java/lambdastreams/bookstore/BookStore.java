package lambdastreams.bookstore;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BookStore {
    private List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public Integer getNumberOfBooks() {
//        return books.stream().mapToInt(Book::getCount).sum();
        return books.stream().reduce(0, (sum, book) -> sum + book.getCount(), Integer::sum);
    }

    public Optional<Book> findNewestBook() {
        return books.stream().max(Comparator.comparing(Book::getYearOfPublish));
    }

    public Integer getTotalValue() {
//        return books.stream().mapToInt(book -> book.getPrice() * book.getCount()).sum();
        return books.stream().reduce(0, (sum, book) -> sum + book.getPrice() * book.getCount(), Integer::sum);
    }
}
