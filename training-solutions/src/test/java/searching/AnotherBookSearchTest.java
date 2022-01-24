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
        Book book = search.findBookByAuthorTitle("Illés Andrea", "Királylányos könyv");
        //Then
        assertEquals(1073, book.getId());
        assertEquals("Illés Andrea", book.getAuthor());
        assertEquals("Királylányos könyv", book.getTitle());
        assertEquals("1073 Illés Andrea Királylányos könyv", book.toString());
    }
}