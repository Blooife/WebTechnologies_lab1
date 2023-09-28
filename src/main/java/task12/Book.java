package task12;

import task3.Main;

import java.util.Comparator;
import java.util.Objects;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;

    private String isbn;
    private static final int edition;

    public Book(String t, String a, int p , String isbn){
        title = t;
        author = a;
        price = p;
        this.isbn = isbn;
    }

    static {
        edition = 19;
    }

    public Book(){

    }

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPrice(){
        return this.price;
    }
    public int getEdition(){
        return edition;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public void setTitle(String t){
        this.title = t;
    }
    public void setAuthor(String a){
        this.author = a;
    }
    public void setPrice(int p){
        this.price = p;
    }
    @Override
    public String toString() {
        return "\"" + title + "\", " + author + ", " + edition + ", " + price;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book b = (Book) o;
        if (!Objects.equals(title, b.title)) return false;
        if (!Objects.equals(author, b.author)) return false;
        if (!Objects.equals(edition, b.getEdition())) return false;
        return Objects.equals(price, b.price);
    }

    @Override
    public int hashCode() {
       // return Objects.hash(title, price, author, edition);
        return title.hashCode() + 2 * author.hashCode() + 3 * Integer.hashCode(price) + 4 * Integer.hashCode(edition) + 5 * isbn.hashCode() + 12345;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Book newBook = new Book();
        newBook.author = author;
        newBook.title = title;
        newBook.price = price;
        newBook.isbn = isbn;
        return newBook;
    }

    @Override
    public int compareTo(Book o) {
        return isbn.compareTo(o.isbn);
    }

}
