package task13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgrammerBookTest extends ProgrammerBook {

    @Test
    public void checkEquals() {
        ProgrammerBook book1 = new ProgrammerBook("Networks","Olifer",25,"abc","Java",2);

        ProgrammerBook book2 = new ProgrammerBook("Pascal programming","Virt",15,"abc","Pascal",1);

        ProgrammerBook book3 = new ProgrammerBook("Networks","Olifer",25,"abc","Java",2);

        assertEquals(book1, book3);
        assertNotEquals(book1, book2);
    }

    @Test
    public void checkToString() {
        ProgrammerBook book = new ProgrammerBook("Pascal programming","Virt",15,"abc","Pascal",1);

        String expected = "(\"Pascal programming\", Virt, 19, 15), Pascal, 1";
        assertEquals(expected, book.toString());
    }

    @Test
    public void testHashCode() {
        ProgrammerBook book1 = new ProgrammerBook("Networks","Olifer",25,"abc","Java",2);

        ProgrammerBook book2 = new ProgrammerBook("Pascal programming","Virt",15,"abc","Pascal",1);

        ProgrammerBook book3 = new ProgrammerBook("Networks","Olifer",25,"abc","Java",2);

        assertEquals(book1.hashCode(), book3.hashCode());
        assertNotEquals(book1.hashCode(), book2.hashCode());
    }
}