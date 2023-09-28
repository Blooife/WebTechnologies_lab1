package task12;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorTest extends Book {

    List<Book> books;
    int x;

    @Before //automatically dont run this method so i call it manually. needs fixing!!!!!!!!!!!!
    public void setUp() {
        books = new ArrayList<>();
        books.add(new Book("B", "3", 17, "abc"));
        books.add(new Book("A", "1", 33, "abc"));
        books.add(new Book("C", "2", 28, "abc"));
        books.add(new Book("A", "3", 21, "abc"));
        x = 5;
    }

    @Test
    public void checkByTitleComparator() {
        setUp();
        books.sort(new BookByTitleComparator());
        assertEquals("A", books.get(0).getTitle());
        assertEquals("A", books.get(1).getTitle());
        assertEquals("B", books.get(2).getTitle());
        assertEquals("C", books.get(3).getTitle());
    }

    @Test
    public void checkByAuthorTitleComparator() {
        setUp();

        books.sort(new BookByAuthorTitleComparator());

        assertEquals("1", books.get(0).getAuthor());

        assertEquals("2", books.get(1).getAuthor());

        assertEquals("3", books.get(2).getAuthor());
        assertEquals("A", books.get(2).getTitle());

        assertEquals("3", books.get(3).getAuthor());
        assertEquals("B", books.get(3).getTitle());

    }

    @Test
    public void checkByTitleAuthorComparator() {
        setUp();

        books.sort(new BookByTitleAuthorComparator());

        assertEquals("A", books.get(0).getTitle());
        assertEquals("1", books.get(0).getAuthor());

        assertEquals("A", books.get(1).getTitle());
        assertEquals("3", books.get(1).getAuthor());

        assertEquals("B", books.get(2).getTitle());

        assertEquals("C", books.get(3).getTitle());
    }

    @Test
    public void checkByAuthorTitlePriceComparator() {
        setUp();
        books.add(new Book("B", "3", 5, "abc"));

        books.sort(new BookByAuthorTitlePriceComparator());

        assertEquals("1", books.get(0).getAuthor());
        assertEquals("A", books.get(0).getTitle());
        assertEquals(33, books.get(0).getPrice());

        assertEquals("2", books.get(1).getAuthor());
        assertEquals("C", books.get(1).getTitle());
        assertEquals(28, books.get(1).getPrice());

        assertEquals("3", books.get(2).getAuthor());
        assertEquals("A", books.get(2).getTitle());
        assertEquals(21, books.get(2).getPrice());

        assertEquals("3", books.get(3).getAuthor());
        assertEquals("B", books.get(3).getTitle());
        assertEquals(5, books.get(3).getPrice());

        assertEquals("3", books.get(4).getAuthor());
        assertEquals("B", books.get(4).getTitle());
        assertEquals(17, books.get(4).getPrice());

    }
}