package searching;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnotherBookSearchTest {
    @Test
    void findBookByAuthorTitle() throws IOException {
        List<Book> books = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get("src/test/resources/books.csv"));
        for (String s : lines) {
            String[] lineParts = s.split(";");
            books.add(new Book(Integer.parseInt(lineParts[0]), lineParts[1], lineParts[2]));
        }
        //Given
        BookSearch search = new BookSearch(books);
        //When
        Book book = search.findBookByAuthorTitle("Anna Mangan", "Az elfeledett mackó");
        //Then
        assertEquals(1172, book.getId());
        assertEquals("Anna Mangan", book.getAuthor());
        assertEquals("Az elfeledett mackó", book.getTitle());
        assertEquals("1172 Anna Mangan Az elfeledett mackó", book.toString());
    }
}