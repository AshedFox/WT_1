package BSUIR.WT.Lab1.ClassesAndObjects;

import java.util.Comparator;

public class BookTitleThenAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return Comparator.comparing(Book::getTitle).thenComparing(Book::getAuthor).compare(book1, book2);
    }
}
