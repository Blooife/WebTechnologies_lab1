package task13;

import task12.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(){

    }
    public ProgrammerBook(String title, String author, int price, String isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString() {
        return "(" + super.toString() + "), "  + language + ", " + level;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(obj == null)
            return false;
        if (!obj.getClass().equals(ProgrammerBook.class))
            return false;
       /* if (!super.equals((Book)obj))
            return false;*/
        ProgrammerBook testObj = (ProgrammerBook) obj;
        return language.equals(testObj.language) && level == testObj.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }
}
