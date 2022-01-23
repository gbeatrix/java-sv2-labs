package streams;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Read {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages) {
        return books.stream()
                .filter(b -> b.getPages() < maxNumberOfPages)
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    public List<String> listBookTitlesWithGivenAuthor(String author) {
        return books.stream()
                .filter(b -> b.getAuthor().equals(author))
                .map(Book::getTitle)
                .sorted(Collator.getInstance())
                .collect(Collectors.toList());
    }

    public List<String> listAuthors() {
        return books.stream()
                .map(Book::getAuthor)
                .distinct()
                .collect(Collectors.toList());
    }
}
