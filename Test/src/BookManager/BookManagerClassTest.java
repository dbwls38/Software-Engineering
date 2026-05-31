package BookManager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookManagerClassTest {

    @Test
    void testAddBook() {
        BookManagerClass manager = new BookManagerClass();
        manager.addBook("Java Basics");
        assertTrue(manager.getBooks().contains("Java Basics"));
    }

    @Test
    void testRemoveBook() {
        BookManagerClass manager = new BookManagerClass();
        manager.addBook("Spring Boot");
        assertTrue(manager.removeBook("Spring Boot"));
        assertFalse(manager.getBooks().contains("Spring Boot"));
    }

    @Test
    void testGetBooks() {
        BookManagerClass manager = new BookManagerClass();
        manager.addBook("Effective Java");
        manager.addBook("Clean Code");
        assertEquals(2, manager.getBooks().size());
    }
}
