package BSUIR.WT.Lab1.ClassesAndObjects;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private String isbn;
    private static int edition;

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public static int getEdition() {
        return edition;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) &&
                price == book.price && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, isbn);
    }

    @Override
    public String toString() {
        return String.format("Title: %s;Author: %s;Price:%d;ISBN: %s;", title, author, price, isbn);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public int compareTo(Book book) {
        return isbn.compareTo(book.isbn);
    }
}
